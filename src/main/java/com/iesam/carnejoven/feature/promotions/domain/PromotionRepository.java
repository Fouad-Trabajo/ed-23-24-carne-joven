package com.iesam.carnejoven.feature.promotions.domain;

import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.util.ArrayList;

public interface PromotionRepository {
    void createPromotion();

    void deletePromotion(String id);

    Promotion getPromotion(String id);

    ArrayList<Promotion> getPromotions();
}
