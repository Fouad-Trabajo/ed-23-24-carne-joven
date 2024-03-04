package com.iesam;

import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;
import com.iesam.carnejoven.feature.promotions.presentation.PromotionPresentation;

public class Main {
    public static void main(String[] args) {

        /**
         * NO pide hacer el main en el ejercicio
         */

        Promotion newPromotion1= new Promotion("@45","ahorrro",
                "ahorro de dinero","20%");
        Promotion newPromotion2= new Promotion("@46","ahorrro",
                "ahorro de dinero","20%");
        PromotionPresentation.createPromotion(newPromotion1);
        PromotionPresentation.createPromotion(newPromotion2);
    }
}