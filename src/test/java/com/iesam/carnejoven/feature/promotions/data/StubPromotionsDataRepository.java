package com.iesam.carnejoven.feature.promotions.data;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.util.ArrayList;

public class StubPromotionsDataRepository implements PromotionRepository {
    @Override
    public void createPromotion(Promotion promotion) {

    }

    @Override
    public void deletePromotion(String id) {

    }

    @Override
    public Promotion getPromotion(String id) {
        return null;
    }

    //Solo me hace falta este, pero debo implementar todos los métodos de una interfaz
    @Override
    public ArrayList<Promotion> getPromotions() {
        return null;
    }
}
