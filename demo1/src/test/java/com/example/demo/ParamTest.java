package com.example.demo;

public class ParamTest {

    public static void main(String[] args) {
        System.out.println(new ParamTest().getA());
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
