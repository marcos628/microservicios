package com.tuempresa.api_usuarios.model;

public class User {
    private Long id;
    private String name;
    private String email;

    // Constructor sin argumentos (necesario para algunas operaciones de deserialización)
    public User() {}

    // Constructor con argumentos
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString() (opcional)
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
