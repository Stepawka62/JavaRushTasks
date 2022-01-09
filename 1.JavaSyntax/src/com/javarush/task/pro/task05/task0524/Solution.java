package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

import java.util.Arrays;

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        coordinates = new int[200];
        for (int i = 0; i < coordinates.length; i += 2) {
            if (i == 0) {
                coordinates[i] = x;
            } else {
                coordinates[i] = coordinates[i - 2] + 10;
            }
        }
        for (int i = 1; i < coordinates.length; i += 2) {
            if (i == 1) {
                coordinates[i] = y;
            } else {
                coordinates[i] = coordinates[i - 2] + 10;
            }

        }

        System.out.println(Arrays.toString(coordinates));


    }
}