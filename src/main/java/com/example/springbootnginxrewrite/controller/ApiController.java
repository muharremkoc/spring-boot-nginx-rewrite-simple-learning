package com.example.springbootnginxrewrite.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Hidden
@Controller
public class ApiController {

    @RequestMapping(value = "/api-nginx", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        return "redirect:/api-nginx/swagger-ui/index.html";
    }

}
