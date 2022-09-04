package com.bridgelabz.Registration.and.Login.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.bridgelabz.Registration.and.Login.model.User;
import com.bridgelabz.Registration.and.Login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}