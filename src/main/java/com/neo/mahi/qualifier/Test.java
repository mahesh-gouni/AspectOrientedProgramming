package com.neo.mahi.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext a = new AnnotationConfigApplicationContext("com.neo.mahi.qualifier");
       ExternalServ conn= a.getBean(ExternalServ.class);
       conn.getConn();
    }
}
