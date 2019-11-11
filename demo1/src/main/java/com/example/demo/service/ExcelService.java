package com.example.demo.service;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Service;

@Service
public class ExcelService {

    public HSSFWorkbook exportExcel() {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("测试");
        CellRangeAddress region = new CellRangeAddress(0,0,(short)1,(short)2);
        sheet.addMergedRegion(region);
        //添加样式
        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER); // 居中
        cellStyle.setBorderBottom(BorderStyle.DOUBLE); //下边框
        cellStyle.setFillForegroundColor((short) 13);// 设置背景色

        HSSFRow row1 = sheet.createRow(0);
        HSSFCell cell1 = row1.createCell(0);
//        HSSFCell cell2 = row1.createCell(1);
//        HSSFRow row2 = sheet.createRow(1);
//        HSSFCell cell3 = row2.createCell(0);
//        HSSFCell cell4 = row2.createCell(1);

        cell1.setCellStyle(cellStyle);
//        cell2.setCellStyle(cellStyle);
//        cell3.setCellStyle(cellStyle);
//        cell4.setCellStyle(cellStyle);

        return wb;

    }
}
