package com.telran.org.lessontwelve.homeworktwelve;

import com.telran.org.lessontwelve.homeworktwelve.taskone.FrequencyDictionary;
import com.telran.org.lessontwelve.homeworktwelve.tasktwo.Storage;
import com.telran.org.lessontwelve.homeworktwelve.tasktwo.initializer.Initializer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Startup {
    void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        while (isWorking) {
            System.out.print("1. Task one.\n" +
                    "2. Task two.\n" +
                    "9. Exit.\n" +
                    "Enter some action: ");
            int personChoose = scanner.nextInt();

            switch (personChoose) {
                case 1:
                    taskOne();
                    break;
                case 2:
                    taskTwo();
                    break;
                case 9:
                    isWorking = false;
                    break;
                default:
                    System.out.println("Wrong value!");
                    break;
            }
        }

        scanner.close();
    }

    private void taskOne() {
        FrequencyDictionary frequencyDictionary = new FrequencyDictionary();
        Map<Character, Integer> dictionary = new HashMap<>();

        System.out.println("Текст-экземпляр для задания -> 'Hello World! How are u?'");
        frequencyDictionary.countCharacter(dictionary, "Hello World! How are u?");
        frequencyDictionary.printDictionary(dictionary);
    }

    private void taskTwo() {
        Storage storage = new Storage();
        Initializer initializer = new Initializer();
        Scanner scanner = new Scanner(System.in);

        initializer.initialize(storage);
        storage.printAllUsers();

        System.out.println("To select, write the username: ");
        storage.showInfoByName(scanner.nextLine());
    }
}
