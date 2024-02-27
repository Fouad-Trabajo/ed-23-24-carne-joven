package com.iesam.carnejoven.feature.user.domain;

public class User {

    public final String nif;
    public final String name;
    public final String surname;
    public final String direcction;


    public User(String nif, String name, String surname, String direcction) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.direcction = direcction;
    }
}
