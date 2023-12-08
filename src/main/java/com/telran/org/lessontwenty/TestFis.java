package com.telran.org.lessontwenty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestFis {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessontwenty";

        try (FileInputStream fileInputStream = new FileInputStream(pathToFile + "\\fileone.txt")) {
            System.out.println("Available bytes in file: " + fileInputStream.available());

            fileInputStream.skip(5);
            while (fileInputStream.available() > 0) {
                System.out.print(" " + (char)fileInputStream.read());
            }

        }  catch (IOException e) {
            System.out.println("We have a problem " + e.getMessage());
        }


        FileReader fileReader;
        try {
            fileReader = new FileReader(pathToFile + "\\fileone.txt");

            char[] chars = new char[20];
            int count = 0;

            while (fileReader.ready()) {
                int read = fileReader.read(chars);
                System.out.println(Arrays.toString(chars) + " count chars: " + read);
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
