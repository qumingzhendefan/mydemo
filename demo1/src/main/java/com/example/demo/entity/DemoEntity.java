package com.example.demo.entity;

import java.io.Serializable;

public class DemoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String aaa;

    private float bbb;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public float getBbb() {
        return bbb;
    }

    public void setBbb(float bbb) {
        this.bbb = bbb;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "aaa='" + aaa + '\'' +
                ", bbb=" + bbb +
                '}';
    }
}
