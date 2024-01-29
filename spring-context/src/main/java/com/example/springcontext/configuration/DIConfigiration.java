package main.java.com.example.springcontext.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(value={com.example.springcontext.consumer})
public class DIConfigiration {
    
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }

}
