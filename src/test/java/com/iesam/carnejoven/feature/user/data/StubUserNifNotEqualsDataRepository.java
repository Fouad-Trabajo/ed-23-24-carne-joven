package com.iesam.carnejoven.feature.user.data;

import com.iesam.carnejoven.feature.user.domain.User;
import com.iesam.carnejoven.feature.user.domain.UserRepository;

public class StubUserNifNotEqualsDataRepository implements UserRepository {
    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(String nif) {
        if("1".equals(nif)) {
            return new User("1", "Rodolfo", "Garrido", "Barcelona");
        }
        return null;
    }
}
