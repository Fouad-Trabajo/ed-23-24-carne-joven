package com.iesam.carnejoven.feature.promotions.data;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.util.ArrayList;

public class StubPromotionIdEqualsDataRepository implements PromotionRepository {
    @Override
    public void createPromotion(Promotion promotion) {

    }

    @Override
    public void deletePromotion(String id) {

    }

    @Override
    public Promotion getPromotion(String id) {
        //Simulación de encontrar una promoción con el id que buscamos
        if("1".equals(id)){
            return new Promotion("1","Oferta","Ofertón","10%");
        }
        return null;
    }

    @Override
    public ArrayList<Promotion> getPromotions() {
        return null;
    }
}
