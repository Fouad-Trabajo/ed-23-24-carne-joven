package com.iesam.carnejoven.feature.user.data;

import com.iesam.carnejoven.feature.user.domain.User;
import com.iesam.carnejoven.feature.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {

    //Instancia de tipo UserDataRepository de SingleTon
    private static UserDataRepository instance= null;

    //Implementación de patrón SingleTon
    public static UserDataRepository newInstance(){
        if(instance==null){
            instance= new UserDataRepository();
        }
        return instance;
    }


    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUser(String nif) {
        return null;
    }
}
