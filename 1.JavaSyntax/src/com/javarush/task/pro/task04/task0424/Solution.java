package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

/* 
Бомба в ядре планеты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);


        do{
            int a = bombInterface.nextInt();
            if (a % 10 != 0) {

                System.out.println(a);
            } else {
                System.out.println(a);
                break;
            }
        }
        while(true);
    }
}
