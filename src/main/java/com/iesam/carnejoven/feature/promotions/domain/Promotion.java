package com.iesam.carnejoven.feature.promotions.domain;

public class Promotion {

    public final String id;
    public final String title;
    public final String description;
    public final String disconut;


    public Promotion(String id, String title, String description, String disconut) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.disconut = disconut;
    }
}
