package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/*
 *java中对日期的加减操作
 *gc.add(1,-1)表示年份减一.
 *gc.add(2,-1)表示月份减一.
 *gc.add(3.-1)表示周减一.
 *gc.add(5,-1)表示天减一.
 *以此类推应该可以精确的毫秒吧.没有再试.大家可以试试.
 *GregorianCalendar类的add(int field,int amount)方法表示年月日加减.
 *field参数表示年,月.日等.
 *amount参数表示要加减的数量.
 *
 * UseDate.java 测试如下:
 */

class DateDemo {

    private static Date d = new Date();
    private static GregorianCalendar gc = new GregorianCalendar();
    private static SimpleDateFormat sf  = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {

        String today = getToDay();
        System.out.println(today);

        String lastDay = getLastDay();
        System.out.println(lastDay);

        String carMonBgn = getCarMonBgn();
        System.out.println(carMonBgn);

        String lastMonBgn = getLastMonBgn();
        System.out.println(lastMonBgn);

        String lastMonAcm = getLastMonAcm();
        System.out.println("lastMonAcm = " + lastMonAcm);

        String lastYearBgn = getLastYearBgn();
        System.out.println(lastYearBgn);

        String lastYearAcm = getLastYearAcm();
        System.out.println(lastYearAcm);
    }

    public static String getToDay(){
        return sf.format(d);
    }

    public static String getLastDay(){
        gc.setTime(d);
        gc.add(5,-1);
        return sf.format(gc.getTime());
    }

    public static String getCarMonBgn(){
        gc.setTime(d);
        gc.set(Calendar.DAY_OF_MONTH, 1);
//        gc.set(gc.get(Calendar.YEAR),gc.get(Calendar.MONTH),gc.get(Calendar.DATE));
        return sf.format(gc.getTime());
    }

    public static String getLastMonBgn(){
        gc.setTime(d);
        gc.set(Calendar.DAY_OF_MONTH, 1);
        gc.add(2,-1);
        return sf.format(gc.getTime());
    }

    public static String getLastMonAcm(){
        gc.setTime(d);
        gc.add(2,-1);
        return sf.format(gc.getTime());
    }

    public static String getLastYearBgn(){
        gc.setTime(d);
        gc.set(Calendar.DAY_OF_MONTH, 1);
        gc.add(1,-1);
        return sf.format(gc.getTime());
    }

    public static String getLastYearAcm(){
        gc.setTime(d);
        gc.add(1,-1);
        return sf.format(gc.getTime());
    }
}
