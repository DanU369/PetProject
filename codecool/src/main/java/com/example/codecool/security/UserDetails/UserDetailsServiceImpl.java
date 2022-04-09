package com.example.codecool.security.UserDetails;

import com.example.codecool.model.AppUser;
import com.example.codecool.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.getUserByUsername(username);
        if (appUser == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        return new UserDetailsImpl(appUser);
    }
}
