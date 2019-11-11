package com.example.apidocument.demo3.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;


public class CompanyBean {

    @ApiModelProperty("公司名")
    private String companyName;

    private WorkerBean worker;

    private List<WorkerBean> workerList;

    private List<List<WorkerBean>> workerListList;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public WorkerBean getWorker() {
        return worker;
    }

    public void setWorker(WorkerBean worker) {
        this.worker = worker;
    }

    public List<WorkerBean> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<WorkerBean> workerList) {
        this.workerList = workerList;
    }

    public List<List<WorkerBean>> getWorkerListList() {
        return workerListList;
    }

    public void setWorkerListList(List<List<WorkerBean>> workerListList) {
        this.workerListList = workerListList;
    }
}
