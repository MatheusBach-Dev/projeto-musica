package com.projetomusica.backend.domain.model;

public class LoginRequest {
    
    private String email;
    private String senha;

    // construtor vazio (obrigatório)
    public LoginRequest() {
    }

    //construtor 
    public LoginRequest(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // getters and setters ha 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}