package com.bootcamp.coffeeshop.users.domain.model;

public record AuthenticatedUser(Long id, Role role) {
    public boolean isAdmin() {
        return role == Role.ADMIN;
    }
}
