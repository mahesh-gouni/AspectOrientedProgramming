package com.neo.mahi.qualifier;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
public class SqlConnection implements Connection{


    private TcpConnectionService tcp;
    public SqlConnection(TcpConnectionService tcp){
        System.out.println("SQL ---->>>>>>>");
        this.tcp = tcp;
    }

    @Override
    public MahiConnection getConnection(String url, String userName, String password) {
        MahiConnection mahi = new MahiConnection("SQL");
        System.out.println("Connected sql db");
        tcp.connect();
        return mahi;

    }
}
