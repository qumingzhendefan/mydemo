package com.example.demo;

public class Flag {

    public static void main(String[] args) {
        Integer flag = new Integer(0);
        sp(flag);
        System.out.println(flag);
        System.out.println(0x99CCFF);
    }

    private static void sp(Integer flag){
        System.out.println(flag);
        flag++;
    }
}
