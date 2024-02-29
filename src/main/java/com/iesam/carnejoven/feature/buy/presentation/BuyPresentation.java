package com.iesam.carnejoven.feature.buy.presentation;

import com.iesam.carnejoven.feature.buy.data.BuyDataRepository;
import com.iesam.carnejoven.feature.buy.domain.Buy;
import com.iesam.carnejoven.feature.buy.domain.CreateBuyUseCase;
import com.iesam.carnejoven.feature.buy.domain.GetBuysUseCase;

import java.util.ArrayList;


public class BuyPresentation {


    public static void createBuy(Buy buy) {
        BuyDataRepository buyDataRepository = BuyDataRepository.newInstance();
        CreateBuyUseCase createBuyUseCase = new CreateBuyUseCase(buyDataRepository);
        createBuyUseCase.execute(buy);
    }

    public static void printBuys() {
        GetBuysUseCase getBuysUseCase = new GetBuysUseCase(BuyDataRepository.newInstance());
        ArrayList<Buy> buys = getBuysUseCase.execute();
        //imprimir todas las mascotas
        System.out.println(buys.toString());
    }
}
