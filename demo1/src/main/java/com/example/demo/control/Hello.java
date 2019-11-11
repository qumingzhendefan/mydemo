package com.example.demo.control;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.ExcelService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@RestController
@RequestMapping("/demo")
public class Hello {

    @Autowired
    private ExcelService excelService;

    @RequestMapping(path = {"/helloSpringBoot"},method = RequestMethod.POST)
    public String HelloSpring (@RequestBody DemoEntity demoEntity){
        System.out.println(demoEntity);
        return "hello spring boot";
    }

    @RequestMapping(path = {"/exportExcel"},method = RequestMethod.GET)
    public void exportExcel (HttpServletResponse response){
        HSSFWorkbook wb = excelService.exportExcel();
        try(OutputStream os = response.getOutputStream()) {
            wb.write();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
