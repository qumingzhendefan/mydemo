package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Object> demo = new HashMap<String,Object>();
        double x = 1932.0;
        demo.put("demo",x);
        String xt = (String) demo.get("demo");
        System.out.println(xt);
    }
}
