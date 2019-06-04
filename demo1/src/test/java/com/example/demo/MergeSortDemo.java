package com.example.demo;

import java.util.List;

public class MergeSortDemo {

    public static int[] mergeSort(int[] a,int listSize) {
        return mergeSortRecursion(a,0,listSize - 1);
    }

    private static int[] mergeSortRecursion(int[] a,int start,int listSize) {
        //终止递归条件
        if (start > listSize){
            return a;
        }

        int middle = (int) Math.floor((start+listSize)/2);
        mergeSortRecursion(a,start,middle);
        mergeSortRecursion(a,middle+1,listSize);

        return a;
    }

    private static int[] mergeList(int[] a,int[] b,int[] c) {
       int[] tmp = new int[a.length];
       int i = 0, j = 0;
       for (int k = 0;k<a.length;k++) {
            if (b[i] > c[j]){

            }
        }
        return a;
    }
}
