package org.example;

public class FindMax {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static Integer findMax(Integer[] arr){
        Integer max = -38767;
        for(Integer s : arr)
         if(max.compareTo(s) < 0){
             max = s;
         }
        return max;
    }
}