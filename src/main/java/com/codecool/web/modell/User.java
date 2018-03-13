package com.codecool.web.modell;

public class User {
    private String name;
    private String emailAddress;
    private String message;

    public User(String name, String emailAddress, String message) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.message = message;

    }

    @Override
    public String toString() {
        return "Name: " + name + " Email: " + emailAddress + " Message: "  + message;
    }
}
