package com.neo.mahi.prototype;


import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class User {
    private final ObjectProvider<Atm> atmProvider;

    public User(ObjectProvider<Atm> atmProvider) {
        this.atmProvider = atmProvider;
        System.out.println("User ---->>>>>>>");
    }

    public void getUser() {
        System.out.println("Get User");
        Atm atm = atmProvider.getObject();
        atm.getMoney();
    }
}
