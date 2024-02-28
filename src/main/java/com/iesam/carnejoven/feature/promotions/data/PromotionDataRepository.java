package com.iesam.carnejoven.feature.promotions.data;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {

    //Instancia de patrón Singleton
    private static PromotionDataRepository instance = null;

    //Implementación de patrón de dieseño: SingleTon
    public static PromotionDataRepository newInstance(){
        if(instance==null){
            instance= new PromotionDataRepository();
        }
        return instance;
    }

    @Override
    public void createPromotion() {

    }

    @Override
    public void deletePromotion(String id) {

    }

    @Override
    public Promotion getPromotion(String id) {
        return null;
    }

    @Override
    public ArrayList<Promotion> getPromotions() {
        return null;
    }
}
