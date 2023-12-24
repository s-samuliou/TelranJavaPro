package com.telran.org.twentythree.exceptiontest;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestExcp {

    //Throwable

    // 1. Errors - не трогаем и не обрабатываем
    // 2. Exceptions - пробуем обработать, создаём свои, генерируем
    // работаем только с 2

    // Checked - проверяемые (проверяемые при компиляции и требуют обработки)
    // Unchecked - непроверяемые (появляются в рантайме и не требуют обработки на этапе компиляции)

    // Пользовательские исключения - extends from RuntimeExceptions.

    public static void main(String[] args) {
        // Example checked exception
        //checkedExpc();

        //Example of unchecked exception
        uncheckedExcp(10, 0);
    }

    private static void uncheckedExcp(int x, int y) {
        int z = x / y;
        System.out.println("Division y/x = " + z);
    }

    private static void checkedExpc() {
        try {
            FileReader reader = new FileReader("//user//users//one.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
