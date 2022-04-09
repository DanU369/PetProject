package com.example.codecool.service;

import com.example.codecool.model.AppUser;
import com.example.codecool.repository.AppUserRepository;
import com.example.codecool.security.passwordEncoder.PasswordConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;
    private final PasswordConfig passwordConfig;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository, PasswordConfig passwordConfig) {
        this.appUserRepository = appUserRepository;
        this.passwordConfig = passwordConfig;
    }

    public void addUser(AppUser appUser){
        appUser.setPassword(passwordConfig.passwordEncoder().encode(appUser.getPassword()));
        appUserRepository.save(appUser);
    }

    public AppUser getUserByUsername(String username){
        return appUserRepository.getUserByUsername(username);
    }
}
