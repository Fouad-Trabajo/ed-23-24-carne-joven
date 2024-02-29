package com.iesam.carnejoven.feature.user.presentation;

import com.iesam.carnejoven.feature.user.data.UserDataRepository;
import com.iesam.carnejoven.feature.user.domain.CreateUserUseCase;
import com.iesam.carnejoven.feature.user.domain.GetUserUseCase;
import com.iesam.carnejoven.feature.user.domain.User;

public class UserPresentation {

    public static void createUser(User user){
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(UserDataRepository.newInstance());
        createUserUseCase.execute(user);
    }


    public static void printUser(String nif){
        GetUserUseCase getUserUseCase= new GetUserUseCase(UserDataRepository.newInstance());
        User user= getUserUseCase.execute(nif);
        System.out.println(user.toString());
    }

}
