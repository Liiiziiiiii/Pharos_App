package com.example.app.date;

public class HelperClass {
    String name, email, username, password;
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
    public HelperClass(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public HelperClass() {
    }
}
