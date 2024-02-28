package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;

public class DeletePromotionUseCase {

    private PromotionRepository promotionRepository;


    public DeletePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }


    public void execute(String id){
        promotionRepository.deletePromotion(id);
    }
}
