package com.iesam.carnejoven.feature.promotions.domain.usecase;

import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

/**
 * Se han importado estas clases,
 * porque he metido los casos de uso en una carpeta.
 * Como se puede apreciar, no se importa nada de la capa de datos
 */


public class GetPromotionUseCase {

    private PromotionRepository promotionRepository;

    public GetPromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Promotion execute(String id) {
        return this.promotionRepository.getPromotion(id);
    }
}
