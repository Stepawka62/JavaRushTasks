package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a1 = console.nextInt();
        int a2 = console.nextInt();
        if (a2 == 30 && a1 <= 0) {
            System.out.println(DONE);
        }if (a2 < 30 && a1 <= 0){
            System.out.println(NOT_YET);
        } if (a1 > 0 || a2 >= 31){
            System.out.println( HORRIBLY_DONE);
        }
    }
}