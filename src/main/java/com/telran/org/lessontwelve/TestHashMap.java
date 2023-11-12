package com.telran.org.lessontwelve;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        //hello -> 5
        //world -> 15
        //again -> 30
        //hi ->
        //next -> 15
        //key value
        map.put("hello", 5);
        map.put("world", 15);
        map.put("again", 30);
        map.put("hi", 10);
        map.put("newt", 15);

        printMap(map);
        System.out.println();
        map.put("again", 2); //Перезаписывает значение которое было на новое(2)
        printMapVersionTwo(map);

        Integer value = map.get("world");
        System.out.println(value);

        //array
        //"hello" -> hashCode() -> (int, length) - hash -> index in table
        // -> Node -> Node<String, Integer> hello, 5 (if empty in call)
        // -> iterate Node -> equals "hello" -> Node<String, Integer>
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key -> " + entry.getKey() + ";  Value -> " + entry.getValue());
        }
    }

    private static void printMapVersionTwo(Map<String, Integer> map) {
        map.forEach((key, value) -> {
            System.out.println("Key -> " + key + ";  Value -> " + value);
        });
    }
}
