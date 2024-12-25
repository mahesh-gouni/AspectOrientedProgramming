package com.neo.mahi.assignment2;

import org.springframework.beans.factory.annotation.Autowired;

public class Security {

    public Security(){
        System.out.println("constructor security");
    }

    @Autowired
    Locker locker;

    public void validation(Role role){
        System.out.println("security validation");
        locker.greet(role);

    }

}
