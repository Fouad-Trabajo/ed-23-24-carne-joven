package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.util.ArrayList;

public class GetPromotionsUseCase {

    private PromotionRepository promotionRepository;

    public GetPromotionsUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public ArrayList<Promotion> execute(){
        return promotionRepository.getPromotions();
    }
}
