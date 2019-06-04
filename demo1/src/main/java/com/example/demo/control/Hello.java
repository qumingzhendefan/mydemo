package com.example.demo.control;

import com.example.demo.entity.DemoEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class Hello {

    @RequestMapping(path = {"/helloSpringBoot"},method = RequestMethod.POST)
    public String HelloSpring (@RequestBody DemoEntity demoEntity){
        System.out.println(demoEntity);
        return "hello spring boot";
    }
}
