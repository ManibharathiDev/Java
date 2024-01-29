package com.di.DependecyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean("staff")
    public StudentInterface stuConfig()
    {
        return new StaffImpl();
    }
}
