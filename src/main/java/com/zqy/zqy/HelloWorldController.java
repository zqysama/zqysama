package com.zqy.zqy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String helloSpringBoot(){
        return "Hello Spring Boot";
    }
}
