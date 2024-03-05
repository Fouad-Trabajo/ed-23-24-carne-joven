package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.data.StubPromotionIdNotEqualsDataRepository;
import com.iesam.carnejoven.feature.promotions.data.StubPromotionNullDataRepository;
import com.iesam.carnejoven.feature.promotions.data.StubPromotionIdEqualsDataRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetPromotionUseCaseTest {

    private GetPromotionUseCase getPromotionUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionUseCase = null;
    }

    @Test
    public void cuandoLaPromocionEsNulo_laPromocionNoExiste_entoncesRetornarNull() {
        //Given:Declaración de variables
        String id = ",";
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(new StubPromotionNullDataRepository());

        //When
        Promotion result = getPromotionUseCase.execute(id);
        boolean esNulo = (result == null);

        //Then
        Assertions.assertTrue(esNulo);
        //Es true porque la variable "result" es null(quiere decir que no existe objeto Promocion)
    }


    @Test
    public void cuandoLaPromocionExiste_PeroElIdDeLaPromocionNOCoincideConElIdQueBuscamos_entoncesRetornarNull() {
        //Given:Declaración de variables
        String id = "2";
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(new StubPromotionIdNotEqualsDataRepository());

        //When
        Promotion result = getPromotionUseCase.execute(id);
        boolean noCoincide = (result != null && result.id.equals(id));

        //Then
        Assertions.assertFalse(noCoincide);


    }


    @Test
    public void cuandoLaPromocionExiste_ElIdDeLaPromocionCoincideConElIdQueBuscamos_entoncesRetornarElObjetoPromocion() {
        //Given: Declaración de variables
        String id = "1";
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(new StubPromotionIdEqualsDataRepository());


        //When

        Promotion result = getPromotionUseCase.execute(id);
        boolean coincide = (result != null && result.id.equals(id));

        //Then
        Assertions.assertTrue(coincide);
        //Es true porque la variable "coincide" no es null (existe objeto) y además coincide
    }
}