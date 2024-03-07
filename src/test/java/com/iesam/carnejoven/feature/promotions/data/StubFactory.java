package com.iesam.carnejoven.feature.promotions.data;

import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

public class StubFactory  {
    public static Promotion getPromotion(){
        return new Promotion("@145","Black Friday","Rebajas de Ian","99%");
    }
}
