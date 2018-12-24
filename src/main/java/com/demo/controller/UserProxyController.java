package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proxy")
public class UserProxyController {
    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }
}
