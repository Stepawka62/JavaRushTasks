package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       String a = console.nextLine();
       int b = console.nextInt();
       if (b >= 18 && b <= 28){
           System.out.println(a + ", явитесь в военкомат");
       }
    }
}
