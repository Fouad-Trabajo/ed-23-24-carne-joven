package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.data.StubPromotionsNotNullDataRepository;
import com.iesam.carnejoven.feature.promotions.data.StubPromotionsNullDataRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class GetPromotionsUseCaseTest {

    private GetPromotionsUseCase getPromotionsUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionsUseCase = null;
    }


    @Test
    public void cuandoLaListaPromocionEsIgualANulo_estaVacia() {
        //Given:Declaración de variables
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(new StubPromotionsNullDataRepository());

        //When
        ArrayList<Promotion> result = getPromotionsUseCase.execute();
        boolean esNulo = (result == null);

        //Then
        Assertions.assertTrue(esNulo);
    }

    //Esto sigue estando mal
    @Test
    public void cuandoLaListaEstaLlena() {
        //Given:Declaración de variables
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(new StubPromotionsNotNullDataRepository());
        ArrayList<Promotion> promotions = new ArrayList<>();

        //When
        ArrayList<Promotion> result = getPromotionsUseCase.execute();
        boolean notNull = (result.equals(promotions));

        //Then
        Assertions.assertTrue(notNull);
    }


}