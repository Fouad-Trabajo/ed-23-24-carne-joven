package com.iesam.carnejoven.feature.user.domain;

public interface UserRepository {
    void createUser(User user);

    User getUser(String nif);
}
