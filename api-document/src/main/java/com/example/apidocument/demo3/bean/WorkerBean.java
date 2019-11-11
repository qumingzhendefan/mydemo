package com.example.apidocument.demo3.bean;

import java.util.List;

public class WorkerBean {

    private String workName;

    private PeopleBean people;

    private List<PeopleBean> peopleBeanList;

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public PeopleBean getPeople() {
        return people;
    }

    public void setPeople(PeopleBean people) {
        this.people = people;
    }
}
