package com.realEstate.realEstate.bean;

public class Email {
    String message;
    String email;

    public Email() {
    }

    public Email(String message, String email) {
        this.message = message;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "message='" + message + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
