package com.bootcamp.coffeeshop.users.infrastructure.adapter.in.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(@NotBlank String email, @NotBlank String password) {
}
