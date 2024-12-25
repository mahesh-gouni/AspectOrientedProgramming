package com.neo.mahi.assignment2;

import org.springframework.beans.factory.annotation.Autowired;

public class Manager {
    public Manager(){
        System.out.println("constructor of manager");
    }

    @Autowired
    public Security security;

    public void validate(Role role){
        System.out.println("manager validation");
        security.validation(role);
    }

}
