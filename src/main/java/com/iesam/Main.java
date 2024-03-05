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
                "ahorro de dineros","20%");
        Promotion newPromotion3= new Promotion("@47","ahorrro",
                "ahorro de dineros","20%");
        //PromotionPresentation.createPromotion(newPromotion1);
        //PromotionPresentation.createPromotion(newPromotion2);
        //PromotionPresentation.createPromotion(newPromotion3);

        //PromotionPresentation.printPromotion("@45");
        //PromotionPresentation.printPromotions();
        //PromotionPresentation.deletePromotion("@46");
        //PromotionPresentation.deletePromotion("@46");


    }
}