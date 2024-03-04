package com.iesam.carnejoven.feature.user.data;

import com.iesam.carnejoven.feature.user.data.local.FileLocalDataSourceUser;
import com.iesam.carnejoven.feature.user.domain.User;
import com.iesam.carnejoven.feature.user.domain.UserRepository;

import java.util.ArrayList;

public class UserDataRepository implements UserRepository {
    private static FileLocalDataSourceUser fileLocalDataSourceUser;

    //Instancia de tipo UserDataRepository de SingleTon
    private static UserDataRepository instance = null;

    //Implementación de patrón SingleTon
    public static UserDataRepository newInstance() {
        if (instance == null) {
            instance = new UserDataRepository();
            fileLocalDataSourceUser = new FileLocalDataSourceUser();
        }
        return instance;
    }

    @Override
    public void createUser(User user) {
        fileLocalDataSourceUser.save(user);
    }

    @Override
    public User getUser(String nif) {
        User user = fileLocalDataSourceUser.obtain();
        if (user != null && user.nif.equals(nif)) ;
        return user;
    }
}
