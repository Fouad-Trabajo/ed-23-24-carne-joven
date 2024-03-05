package com.iesam.carnejoven.feature.buy.data;

import com.iesam.carnejoven.feature.buy.domain.Buy;
import com.iesam.carnejoven.feature.buy.domain.BuyRepository;

import java.util.ArrayList;

public class StubBuyNullDataRepository implements BuyRepository {


    @Override
    public void createBuy(Buy buy) {

    }

    @Override
    public ArrayList<Buy> getBuys() {
        return null;
    }
}
