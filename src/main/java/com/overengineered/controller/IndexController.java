package com.overengineered.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/*")
    public String idx() {
        return "resources/index.html";
    }
}
