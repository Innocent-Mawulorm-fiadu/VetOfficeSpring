package com.mallon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    //@Scope("prototype")
    public Cat catBean(){
        Cat cat = new Cat("Luna");
        cat.setAge(24);
        return cat;
    }
}
