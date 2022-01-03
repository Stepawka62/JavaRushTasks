package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        double kmc = 0;
        double ms = 0;
       Scanner sc = new Scanner(System.in);
        ms = sc.nextInt();
        kmc = ms * 3.6;
        System.out.println(Math.round(kmc));



    }
}