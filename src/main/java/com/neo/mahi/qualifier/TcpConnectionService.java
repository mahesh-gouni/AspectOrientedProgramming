package com.neo.mahi.qualifier;


import org.springframework.stereotype.Service;
public class TcpConnectionService {
    public TcpConnectionService(){
        System.out.println("TCP ---->>>>>>>");
    }

    public void connect(){
        System.out.println("Connected tcp db method");
    }
}
