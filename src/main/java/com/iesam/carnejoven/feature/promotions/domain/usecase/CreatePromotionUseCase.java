package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

public class CreatePromotionUseCase {
    /**
     * Esta clase también se le puede llamar SavePromotionUseCase
     * */

    private PromotionRepository promotionRepository;


    public CreatePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }


    //Método ejecutar
    public void execute(Promotion promotion){
        this.promotionRepository.createPromotion();
    }
}
