package com.example.project_jsp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@Configuration
public class MessageConfig {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new
                ReloadableResourceBundleMessageSource();
        messageSource.setBasename( "classpath:messages/messages" );
        messageSource.setDefaultLocale(Locale. US);
        messageSource.setDefaultEncoding( "UTF-8");
        return messageSource;
    }
}
