package com.iesam.carnejoven.feature.buy.data;

import com.iesam.carnejoven.feature.buy.domain.Buy;
import com.iesam.carnejoven.feature.buy.domain.BuyRepository;

import java.util.ArrayList;

public class BuyDataRepository implements BuyRepository {
    private static BuyDataRepository instance = null;

    public static BuyDataRepository newInstance() {
        if (instance == null) {
            instance = new BuyDataRepository();
        }
        return instance;
    }


    @Override
    public void createBuy(Buy buy) {

    }

    @Override
    public ArrayList<Buy> getBuys() {
        return null;
    }
}
