package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        intListDemo();
    }

    public static void listSelect() {
        List<String> list1 = new ArrayList<String>();
        list1.add("测");
        list1.add("试");
        list1.add("数");
        list1.add("据");
        list1.add("16");
        list1.add("17");
        System.out.println(list1.contains("测"));
    }

    public static void listBugDemo() {
        String[] sList1 = new String[]{"12","1602","1601","16","150403","1504","15","1305","1302","1301","13","120502","1206"};
        String[] sList2 = new String[]{"13","1602","1601","16","1303","1302"};
        List<String> list = new ArrayList<String>();
        getUnorderedUnionSet(list, Arrays.asList(sList1));
        getUnorderedUnionSet(list,Arrays.asList(sList2));
        System.out.println(list);
    }

    public static void ListDemo() {
        List<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();
        list1.add("测");
        list1.add("试");
        list1.add("数");
        list1.add("据");
        list1.add("16");
        list1.add("17");
        List<String> list2 = new ArrayList<String>();
        list2.add("测");
        list2.add("试");
        list2.add("数");
        list2.add("据");
        list2.add("16");
        getUnorderedUnionSet(list,list1);
        getUnorderedUnionSet(list,list2);
        System.out.println(list);
    }

    //获取无序并集
    public static void getUnorderedUnionSet(List<String> list1,List<String> list2) {
        list1.removeAll(list2);
        list1.addAll(list2);
//        return list1;
    }

    public static void addListTest(){
        List<String> list = new ArrayList<>();
        list.add("0");
        System.out.println(list.size());
        addList(list);
        System.out.println(list.size());
    }

    public static List<String> addList(List<String> list){
        list.add("2");
        return list;
    }

    public static void addIndexValue(){
        List<String> strList = new ArrayList<>(10);
        strList.add(9,"9");
        System.out.println(strList);
    }

    public static void sort(List<List<String>> strSs){
        List<String> returnS = new ArrayList<>();
        int flag=0;
        for (int i  = 0;i < strSs.size();i++){
            List<String> strs = strSs.get(i);
            if(flag < strs.size()){
                returnS.add(strs.get(flag));
                if(i == strSs.size()){
                    i = -1;
                    flag++;
                }
            }else{
                break;
            }
        }
    }

    public static void intListDemo(){
        int flag = 0;
        addInt(flag);
        System.out.println(flag);
    }

    public static void addInt(int flag){
        flag++;
        System.out.println(flag);
    }
}
