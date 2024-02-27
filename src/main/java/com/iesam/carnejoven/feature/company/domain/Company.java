package com.iesam.carnejoven.feature.company.domain;

public class Company {

    public final String id;
    public final String name;
    public final String cif;


    public Company(String id, String name, String cif) {
        this.id = id;
        this.name = name;
        this.cif = cif;
    }
}
