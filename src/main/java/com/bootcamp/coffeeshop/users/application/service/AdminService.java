package com.bootcamp.coffeeshop.users.application.service;

import com.bootcamp.coffeeshop.users.application.port.in.AdminUseCase;
import com.bootcamp.coffeeshop.users.application.port.out.UserRepositoryPort;
import com.bootcamp.coffeeshop.users.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AdminService implements AdminUseCase {

    private final UserRepositoryPort userRepository;

    public AdminService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

}
