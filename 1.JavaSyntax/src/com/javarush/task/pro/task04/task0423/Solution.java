package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sa = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
         int a = scanner.nextInt();
            sum+=a;
            sa = sum / 5;
        }
        System.out.println(sa);
    }
}
