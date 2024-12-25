package com.neo.mahi.qualifier;

public interface Connection {
    public MahiConnection getConnection(String url,String userName,String password);
}
