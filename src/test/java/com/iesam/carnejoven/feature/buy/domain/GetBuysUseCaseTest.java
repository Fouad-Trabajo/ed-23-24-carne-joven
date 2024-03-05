package com.iesam.carnejoven.feature.buy.domain;

import com.iesam.carnejoven.feature.buy.data.StubBuyNotNullDataRepository;
import com.iesam.carnejoven.feature.buy.data.StubBuyNullDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetBuysUseCaseTest {

    private GetBuysUseCase getBuysUseCase;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getBuysUseCase=null;
    }

    @Test
    public void cuandoLaListaEstaVaciaEntoncesRetornarNull(){
        //Given
        GetBuysUseCase getBuysUseCase= new GetBuysUseCase(new StubBuyNullDataRepository());
        ArrayList<Buy> buys= new ArrayList<>();


        //when
        ArrayList<Buy> result= getBuysUseCase.execute();
        boolean esNulo=(result==null);

        //then
        Assertions.assertTrue(esNulo);
    }

    @Test
    public void cuandoLaListaEstaLlena(){
        //Given
        GetBuysUseCase getBuysUseCase= new GetBuysUseCase(new StubBuyNotNullDataRepository());
        ArrayList<Buy> buys= new ArrayList<>();


        //when
        ArrayList<Buy> result= getBuysUseCase.execute();
        boolean notNull=(result==buys);

        //then
        Assertions.assertTrue(notNull);
    }
}