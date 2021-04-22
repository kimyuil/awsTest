package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    

    @GetMapping(value = {"", "/error"}, produces = {"text/html"})
    public String index(HttpServletRequest req) {
        return "index.html";
    }

    @Value("${value}")
	String value;
    
    @RequestMapping("/test") 
    @ResponseBody 
    public String index() { 
        return value; 
    }
    
}
