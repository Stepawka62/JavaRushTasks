package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       int a = console.nextInt();
       if (a < 20 || a > 60)
       System.out.println("можно не работать");
    }
}
