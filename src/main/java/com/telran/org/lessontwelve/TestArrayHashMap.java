package com.telran.org.lessontwelve;

import java.util.HashMap;

public class TestArrayHashMap {

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : arr) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                System.out.println("Searching element is: " + element);
                return;
            }
        }
    }
}
