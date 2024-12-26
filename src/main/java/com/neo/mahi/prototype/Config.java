package com.neo.mahi.prototype;


import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.neo.mahi.prototype"})
public class Config {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Atm prototypeBean() {
        return new Atm();
    }

    @Bean
    public User singletonBean(ObjectProvider<Atm> atmProvider) {
        return new User(atmProvider);
    }
}
