package com.iesam.carnejoven.feature.user.domain;

public class GetUserUseCase {


    private UserRepository userRepository;


    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String nif){
        return this.userRepository.getUser(nif);
    }
}
