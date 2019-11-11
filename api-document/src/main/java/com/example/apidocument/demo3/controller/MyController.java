package com.example.apidocument.demo3.controller;

import com.example.apidocument.demo3.bean.CompanyBean;
import com.example.apidocument.demo3.bean.PeopleBean;
import com.example.apidocument.demo3.bean.WorkerBean;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demo")
@Api(value = "我的swagger实践")
public class MyController {

    @ResponseBody
    @RequestMapping(value ="/getNotParamReturnString1", method= RequestMethod.GET)
    public String getNotParamReturnString1(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                                           @RequestParam(value="newPassword") String newPassword) {
        return "demo";
    }

    @ResponseBody
    @RequestMapping(value ="/getNotParamReturnString", method= RequestMethod.GET)
    @ApiOperation(value="实践1，get请求无参返回值为字符串", notes="正确返回值200")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "返回成功"),
            @ApiResponse(code = 401, message = "资源无权限"),
            @ApiResponse(code = 500001, message = "500001|调用失败")
    })
    public String getNotParamReturnString() {
        return "demo";
    }

    @ResponseBody
    @RequestMapping(value ="/getReturnString", method= RequestMethod.GET)
    @ApiOperation(value="实践2，get请求有参返回值为字符串", notes="正确返回值200")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public String getReturnString(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                                  @RequestParam(value="newPassword") String newPassword) {
        return "demo";
    }

    @ResponseBody
    @RequestMapping(value ="/getReturnJson", method= RequestMethod.GET)
    @ApiOperation(value="实践3，get请求有参返回值为json", notes="正确返回值200")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public Map<String, Object> getReturnJson(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                             @RequestParam(value="newPassword") String newPassword) {
        return getMap(userId,password,newPassword);
    }

    @ResponseBody
    @RequestMapping(value ="/getObjectReturnString", method= RequestMethod.GET)
    @ApiOperation(value="实践4，get请求入参对象返回值为对象", notes="正确返回值200")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "workName", value = "工作名称", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "people.name", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "people.sex", value = "性别", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "people.age", value = "年龄", required = true, dataType = "String")
    })
    public String getObjectReturnString(List<WorkerBean> workerBeans) {
        return "name";
    }

    @ResponseBody
    @RequestMapping(value ="/getObjectReturnObject", method= RequestMethod.GET)
    @ApiOperation(value="实践5，get请求入参对象返回值为对象", notes="正确返回值200")
    public WorkerBean getObjectReturnObject(WorkerBean workerBean) {
        return workerBean;
    }

    @ResponseBody
    @RequestMapping(value ="/getObjectReturnObject2", method= RequestMethod.GET)
    @ApiOperation(value="实践6，get请求入参对象返回值为对象", notes="正确返回值200")
    public CompanyBean getObjectReturnObject2(CompanyBean companyBean) {

        return companyBean;
    }

    @ResponseBody
    @RequestMapping(value ="/postNotParamReturnString", method= RequestMethod.POST)
    @ApiOperation(value="实践6，get请求无参返回值为字符串", notes="正确返回值200")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "返回成功"),
            @ApiResponse(code = 500, message = "500001|调用失败"),
            @ApiResponse(code = 500, message = "500002|失败")
    })
    public String postNotParamReturnString() {
        return "demo";
    }

    @ResponseBody
    @RequestMapping(value ="/postReturnString", method= RequestMethod.POST)
    @ApiOperation(value="实践7，get请求有参返回值为字符串", notes="正确返回值200")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public String postReturnString(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                                  @RequestParam(value="newPassword") String newPassword) {
        return "demo";
    }

    @ResponseBody
    @RequestMapping(value ="/postReturnJson", method= RequestMethod.POST)
    @ApiOperation(value="实践8，get请求有参返回值为json", notes="正确返回值200")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public Map<String, Object> postReturnJson(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                                             @RequestParam(value="newPassword") String newPassword) {

        return getMap(userId,password,newPassword);
    }

    private Map getMap(Integer userId,String password,String newPassword) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("userId",userId);
        map.put("password",password);
        map.put("newPassword",newPassword);
        return map;
    }

    @ResponseBody
    @RequestMapping(value ="/postObjectReturnObject", method= RequestMethod.POST)
    @ApiOperation(value="实践9，get请求入参对象返回值为对象", notes="正确返回值200")
    public PeopleBean postObjectReturnObject(PeopleBean peopleBean) {
        return peopleBean;
    }

    @ResponseBody
    @RequestMapping(value ="/postObjectReturnObject2", method= RequestMethod.POST)
    @ApiOperation(value="实践10，get请求入参对象返回值为对象", notes="正确返回值200")
    public WorkerBean postObjectReturnObject2(WorkerBean workerBean) {
        return workerBean;
    }

    @ResponseBody
    @RequestMapping(value ="/getObjectReturnObject3", method= RequestMethod.GET)
    @ApiOperation(value="实践7，get请求入参对象返回值为对象", notes="正确返回值200")
    public CompanyBean getObjectReturnObject3(@RequestBody CompanyBean companyBean) {

        return companyBean;
    }

    @ResponseBody
    @RequestMapping(value ="/getObjectReturnObject4", method= RequestMethod.POST)
    @ApiOperation(value="实践7，get请求入参对象返回值为对象", notes="正确返回值200")
    public List<List<PeopleBean>> getObjectReturnObject4(@RequestBody List<List<PeopleBean>> peopleBean) {

        return peopleBean;
    }
}
