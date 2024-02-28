package com.iesam.carnejoven.feature.buy.domain;

import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import com.iesam.carnejoven.feature.user.domain.User;

public class Buy {

    public final String id;
    public final String dateBuy;
    public Promotion promotion;
    public User user;

    public Buy(String id, String dateBuy, Promotion promotion, User user) {
        this.id = id;
        this.dateBuy = dateBuy;
        this.promotion = promotion;
        this.user = user;
    }
}
