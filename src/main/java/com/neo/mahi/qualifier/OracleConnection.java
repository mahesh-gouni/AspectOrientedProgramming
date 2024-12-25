package com.neo.mahi.qualifier;

import org.springframework.context.annotation.Primary;


public class OracleConnection implements Connection {

    TcpConnectionService tcp;
    public OracleConnection(TcpConnectionService tcp){
        System.out.println("Oracle ---->>>>>>>");
        this.tcp = tcp;
    }


    @Override
    public MahiConnection getConnection(String url, String userName, String password) {
        System.out.println("Oracle Connection");
        MahiConnection m = new MahiConnection("Oracle");
        tcp.connect();
        return m;
    }
}
