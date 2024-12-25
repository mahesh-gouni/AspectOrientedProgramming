package com.neo.mahi.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;




public class ExternalServ {


    @Qualifier("mysqlConnection")
    @Autowired
Connection connection;
    public void getConn() {
        connection.getConnection("url", "userName", "password");
    }

}
