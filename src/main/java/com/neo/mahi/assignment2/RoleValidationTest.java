package com.neo.mahi.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RoleValidationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.neo.mahi.assignment2");
        Manager manager = context.getBean(Manager.class);
        Role role = context.getBean("role", Role.class);

        role.setName("admin1");

            manager.validate(role);
        }
    }



