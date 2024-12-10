package com.example;

public class junitTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(average(1,new int[]{1,2,3}));
    }
    public static  int average(int k, int[] list){

        int average = 0;
        int n = Math.min(k, list.length);
        if( n > 0) {
            for(int i = 0 ; i < n; i++){
                average += list[i];
            }
            average = average/n;
        }
        return average;
    }
}
