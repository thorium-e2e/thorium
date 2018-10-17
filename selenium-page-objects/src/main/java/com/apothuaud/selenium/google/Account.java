package com.apothuaud.selenium.google;

public class Account {

    private final String mail;
    private final String password;

    public Account(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }
}
