package com.example.demo;

public class IfNull {

    private String a = null;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        IfNull isNull = new IfNull();
        isNull.getA();
    }
}
