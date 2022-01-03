package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double S = 3.14 * radius * radius;
        if (radius > 0) {
            System.out.println((int) Math.floor(S));
        } else
            System.out.println();
    }

}
