package com.neo.mahi.qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {

    ExternalServ external;

    public PayService(@Autowired ExternalServ external){
        this.external= external;
    }

    public void pay(){
        System.out.println("from pay");
        external.getConn();
    }
}
