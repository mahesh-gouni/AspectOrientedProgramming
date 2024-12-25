package com.neo.mahi.qualifier;

import org.springframework.context.annotation.*;



@Configuration
@ComponentScan( basePackages = {"com.neo.mahi.qualifier"})
@EnableAspectJAutoProxy
public class ConfigClass {

    @Bean(name = "externalServ")
    public ExternalServ getExternalJavaService(){

        return new ExternalServ();
    }

    @Bean
    public TcpConnectionService tcpConnectionService(){
        return new TcpConnectionService();
    }

   @Bean(name = "mysqlConnection")
    public Connection mysqlConnectionService(TcpConnectionService tcpConnectionService){

        return new SqlConnection(tcpConnectionService());
    }
   @Bean(name = "oracleConnection")
    public Connection oracleConnectionService(TcpConnectionService tcpConnectionService){

        return new OracleConnection(tcpConnectionService());
    }

}
