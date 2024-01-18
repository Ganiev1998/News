package com.example.project_jsp.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewsController {
    private final MessageSource messageSource;

    public NewsController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping()
    public ModelAndView start(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
