package com.example.project_jsp.Config;

import com.example.project_jsp.Config.LanguageInterceptor;
import com.example.project_jsp.Config.LoginIntercertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ReloadableResourceBundleMessageSource messageSource;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercertor()).addPathPatterns("/**");
        registry.addInterceptor(new LanguageInterceptor(messageSource)).addPathPatterns("/**");
    }
}
