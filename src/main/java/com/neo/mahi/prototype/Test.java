package com.neo.mahi.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.neo.mahi.prototype");
        User user = context.getBean(User.class);
        user.getUser();
        user.getUser();
    }

}
