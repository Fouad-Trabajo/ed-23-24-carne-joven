package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.data.StubPromotionsDataRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetPromotionsUseCaseTest {

    private GetPromotionsUseCase getPromotionsUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionsUseCase=null;
    }

    /**
     * Aquí van los test, pero no se sobre que errores hacerlos
     */
    @Test
    public void  cuandoLaListaPromocionEsIgualANulo(){
        //Given:Declaración de variables
        GetPromotionsUseCase getPromotionsUseCase= new GetPromotionsUseCase(new StubPromotionsDataRepository());

        //When
        ArrayList<Promotion> result=getPromotionsUseCase.execute();
        boolean esNulo= (result ==null);

        //Then
        Assertions.assertTrue(esNulo);

    }




}