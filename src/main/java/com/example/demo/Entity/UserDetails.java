package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class UserDetails {
    @Id
    private String email;
    private String username;
    private String password;

    public UserDetails() {
    }

    public UserDetails(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
