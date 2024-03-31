package com.zzw.gulimall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/gateway/")
public class TestController {
    @RequestMapping("/ping")
    public String ping(){
        return "pong";
    }

}
