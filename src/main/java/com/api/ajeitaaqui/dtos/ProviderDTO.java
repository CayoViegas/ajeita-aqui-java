package com.api.ajeitaaqui.dtos;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class ProviderDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String phone;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private List<String> servicesToProvide;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getServicesToProvide() {
        return servicesToProvide;
    }

    public void setServicesToProvide(List<String> servicesToProvide) {
        this.servicesToProvide = servicesToProvide;
    }
}
