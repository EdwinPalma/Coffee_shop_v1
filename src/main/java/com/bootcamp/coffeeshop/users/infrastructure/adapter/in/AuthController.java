package com.bootcamp.coffeeshop.users.infrastructure.adapter.in;

import com.bootcamp.coffeeshop.users.infrastructure.security.AuthenticationService;
import com.bootcamp.coffeeshop.users.infrastructure.adapter.in.dto.AuthResponse;
import com.bootcamp.coffeeshop.users.infrastructure.adapter.in.dto.LoginRequest;
import com.bootcamp.coffeeshop.users.infrastructure.adapter.in.dto.RegisterRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthResponse register(@Valid @RequestBody RegisterRequest request) {
        return new AuthResponse(authenticationService.register(request.name(), request.email(), request.password()));
    }

    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request) {
        return new AuthResponse(authenticationService.login(request.email(), request.password()));
    }
}
