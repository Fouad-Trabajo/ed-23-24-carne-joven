package com.iesam.carnejoven.feature.user.data;

import com.iesam.carnejoven.feature.user.domain.User;
import com.iesam.carnejoven.feature.user.domain.UserRepository;

public class StubUserNullDataRepository implements UserRepository {
    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(String nif) {
        return null;
    }
}
