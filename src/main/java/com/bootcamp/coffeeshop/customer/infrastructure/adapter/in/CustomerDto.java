package com.bootcamp.coffeeshop.customer.infrastructure.adapter.in;

import jakarta.persistence.MapKeyEnumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class CustomerDto {
    private Integer id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    @Email(message = "El email no tiene formato válido")
    private String email;

    @Pattern(
            regexp = "^\\+?[0-9]{7,15}$",
            message = "El número de teléfono solo debe contener números y opcionalmente un signo + al inicio"
    )
    private String phone;

    public CustomerDto(){}

    public CustomerDto(String firstName, String lastName, String email,String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
