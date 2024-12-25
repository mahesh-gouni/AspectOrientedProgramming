package com.neo.mahi.assignment2;


import org.springframework.context.annotation.*;



@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.neo.mahi.assignment2"})
@Configuration
public class Configurationss {


    @Bean(name = "role")
    public Role role(){


        Role role = new Role();
        role.setName("admin");

        return role;
    }
    @Bean
    public Manager manager(){
        return new Manager();
    }
    @Bean
    public Security security(){
        return new Security();
    }

    @Bean
    public Locker Locker(){
        return new Locker();
    }


}
