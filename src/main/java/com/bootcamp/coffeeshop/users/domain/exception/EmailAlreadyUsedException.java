package com.bootcamp.coffeeshop.users.domain.exception;

public class EmailAlreadyUsedException extends RuntimeException {

    public EmailAlreadyUsedException(String email) {
        super("Email already registered: " + email);
    }
}
