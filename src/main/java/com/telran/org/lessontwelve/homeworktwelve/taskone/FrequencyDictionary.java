package com.telran.org.lessontwelve.homeworktwelve.taskone;

import java.util.Map;

public class FrequencyDictionary {
    public void countCharacter(Map<Character, Integer> dictionary, String text) {
        char[] charText = text.toLowerCase().toCharArray();

        for (char c : charText) {
            if (dictionary.containsKey(c)) {
                dictionary.put(c, dictionary.get(c) + 1);
            } else {
                dictionary.put(c, 1);
            }
        }
    }

    public void printDictionary(Map<Character, Integer> dictionary) {
        dictionary.forEach((character, countCharacter) -> {
            System.out.println("Symbol: '" + character + "' Count: " + countCharacter);
        });
    }
}
