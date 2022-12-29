package org.example;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static Integer findMax(Integer[] arr){
        Arrays.sort(arr);
        Integer max = arr[arr.length - 1];
        System.out.println(max);
        return max;
    }
    public static Float findMaxFloat(Float[] arr){
        Arrays.sort(arr);
        Float max = arr[arr.length - 1];
        System.out.println(max);
        return max;
    }
    public static String findMaxString(String[] arr){
        Arrays.sort(arr);
        String max = arr[arr.length - 1];
        System.out.println(max);
        return max;
    }
}