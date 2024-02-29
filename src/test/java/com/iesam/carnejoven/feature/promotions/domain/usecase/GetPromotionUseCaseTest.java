package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.data.Stub2PromotionDataRepository;
import com.iesam.carnejoven.feature.promotions.data.Stub3PromotionDataRepository;
import com.iesam.carnejoven.feature.promotions.data.StubPromotionsDataRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetPromotionUseCaseTest {

    private GetPromotionUseCase getPromotionUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionUseCase=null;
    }

    @Test
    public void  cuandoLaPromocionEsNulo(){
        //Given:Declaración de variables
        String id=",";
        GetPromotionUseCase getPromotionUseCase= new GetPromotionUseCase(new Stub2PromotionDataRepository());

        //When
        Promotion result= getPromotionUseCase.execute(id);
        boolean esNulo= (result==null);

        //Then
        Assertions.assertTrue(esNulo);

    }

    //Este no le he probado, pero creo que no hace falta o que está mal implementado
    @Test
    public void  cuandoElIdDeLaPromocionNoCoincide(){
        //Given:Declaración de variables
        String id=",";
        GetPromotionUseCase getPromotionUseCase= new GetPromotionUseCase(new Stub3PromotionDataRepository());

        //When
        Promotion result= getPromotionUseCase.execute(id);
        boolean esNulo= (result==null);

        //Then
        Assertions.assertTrue(esNulo);

    }
}