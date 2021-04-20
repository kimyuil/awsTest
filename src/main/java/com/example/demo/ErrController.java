package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class ErrController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
