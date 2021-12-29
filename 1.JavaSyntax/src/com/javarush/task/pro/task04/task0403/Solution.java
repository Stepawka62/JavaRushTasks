package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int sum = 0;

       while(true) {
           String str = sc.nextLine();
           if(str.equals("ENTER")) {
               break;
           }

           int a = Integer.parseInt(str);
           sum = sum + a;
       }
       System.out.println(sum);
    }
}