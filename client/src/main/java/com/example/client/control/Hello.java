package com.example.client.control;


import com.example.client.entity.DemoEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class Hello {

    @Value("${server.port}")
    String port;

    @RequestMapping(path = {"/demo"},method = RequestMethod.POST)
    public String HelloSpring (@RequestBody DemoEntity demoEntity){
        System.out.println(demoEntity);
        return "hello spring boot";
    }

    @RequestMapping(path = {"/hello"})
    public String Hello (){
        return "hello spring boot";
    }

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
