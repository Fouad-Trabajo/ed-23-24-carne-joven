package com.iesam.carnejoven.feature.promotions.presentation;

import com.iesam.carnejoven.feature.promotions.data.PromotionDataRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import com.iesam.carnejoven.feature.promotions.domain.usecase.CreatePromotionUseCase;
import com.iesam.carnejoven.feature.promotions.domain.usecase.DeletePromotionUseCase;
import com.iesam.carnejoven.feature.promotions.domain.usecase.GetPromotionUseCase;
import com.iesam.carnejoven.feature.promotions.domain.usecase.GetPromotionsUseCase;

import java.util.ArrayList;

public class PromotionPresentation {

    public static void createPromotion(Promotion promotion) {
        PromotionDataRepository promotionDataRepository = PromotionDataRepository.newInstance();
        CreatePromotionUseCase createPromotionUseCase = new CreatePromotionUseCase(promotionDataRepository);
        createPromotionUseCase.execute(promotion);
    }

    public static void deletePromotion(String id) {
        DeletePromotionUseCase deletePromotionUseCase = new DeletePromotionUseCase(PromotionDataRepository.newInstance());
        deletePromotionUseCase.execute(id);
    }


    public static void printPromotion(String id) {
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(PromotionDataRepository.newInstance());
        Promotion promotion = getPromotionUseCase.execute(id);
        System.out.println(promotion.id);
    }

    public static void printPromotions() {
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(PromotionDataRepository.newInstance());
        ArrayList<Promotion> promotions = getPromotionsUseCase.execute();
        //imprimir cada una de las promociones
        System.out.println(promotions.toString());
    }


}
