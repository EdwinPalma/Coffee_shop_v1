package com.bootcamp.coffeeshop.users.infrastructure.adapter.in.dto;

import com.bootcamp.coffeeshop.users.domain.model.Role;
import com.bootcamp.coffeeshop.users.domain.model.User;

import java.time.LocalDateTime;

public record UserResponse(Long id, String name, String email, Role role, LocalDateTime createdAt) {

    public static UserResponse from(User u) {
        return new UserResponse(u.getId(), u.getName(), u.getEmail(), u.getRole(), u.getCreatedAt());
    }
}
