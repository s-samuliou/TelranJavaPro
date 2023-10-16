package com.telran.org.lessonfive;

import java.util.Arrays;

public class AppArrayTwo {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6,8,9,0}, {7}};
        printArray(arr);
        int[] inner = arr[1];
        inner[2] = 15;
        printArray(arr);

        int[] arrUnsort = {2,3,7,1,3,8,0};
        Arrays.sort(arrUnsort);
        System.out.println(Arrays.toString(arrUnsort));
    }

    private static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }
}
