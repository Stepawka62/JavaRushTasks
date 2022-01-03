package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        int b = 0;
        while (a < 8) {
            while (i < 20) {
                System.out.print("Б");
                i++;
            }
            if (b < 1) {
                b++;
                System.out.println();
            }
            System.out.println("Б                  Б");
            a++;
        }
        if (b == 1) {
            System.out.println("ББББББББББББББББББББ");
        }

    }
}