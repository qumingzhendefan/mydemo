package com.example.zuul.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Hello {

    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        return "hello spring boot";
    }
}
