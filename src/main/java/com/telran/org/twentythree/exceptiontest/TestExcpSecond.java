package com.telran.org.twentythree.exceptiontest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExcpSecond {

    public static void main(String[] args) throws IOException {
        // 1. use try-catch
        int data = getData();

        // 2.
        int dataTwo = getDataAdditional();
    }

    private static int getData() {
        //use try-catch
        try {
            FileInputStream fileInputStream = new FileInputStream("//user//someting//one.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }

    private static int getDataAdditional() throws IOException {
        //
        FileInputStream fileInputStream = new FileInputStream("//user//someting//one.txt");
        int read = fileInputStream.read();
        return 0;
    }

    private static int getDataAdditionalTwo() {
        //Exception -> IOException -> FileNotFoundException
        try {
            FileInputStream fileInputStream = new FileInputStream("//user//someting//one.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found try another file");
        } catch (IOException e) {
            System.out.println("Try again");
        }

        return 0;
    }
}
