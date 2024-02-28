package com.iesam.carnejoven.feature.buy.domain;

import java.util.ArrayList;

public interface BuyRepository {
    void createBuy(Buy buy);

    ArrayList<Buy> getBuys();
}
