package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
    @RequestMapping("/") 
    @ResponseBody 
    public String index() { 
        return "안녕하세요, 스프링입니다."; 
    }
    
}
