package com.bootcamp.coffeeshop.users.application.port.in;

import com.bootcamp.coffeeshop.users.domain.model.User;

import java.util.List;

public interface AdminUseCase {
    List<User> listUsers();
}
