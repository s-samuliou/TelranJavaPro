package com.telran.org.lessontwenty.task;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestTask {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessontwenty\\task\\";
        String[] fileNames = {"A.txt", "B.txt", "C.txt", "D.txt"};

        StringBuilder resultMessage = new StringBuilder();

        for (int i = 0; i < fileNames.length; i++) {
            resultMessage.append(getFileInformation(pathToFile, fileNames[i]) + " ");
        }
        //System.out.println(resultMessage);

        String path = pathToFile + "Res.txt";
        writeDataToFile(path, String.valueOf(resultMessage));

        readFile(path);
    }

    public static void readFile(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            while (fileInputStream.available() > 0) {
                System.out.println(((char)fileInputStream.read()));
            }
        }  catch (IOException e) {
            System.out.println("Houston, we have problems... " + e.getMessage());
        }
    }

    public static StringBuilder getFileInformation(String pathToFile, String name) {
        StringBuilder resultMessage = new StringBuilder();

        try (FileInputStream fileInputStream = new FileInputStream(pathToFile + name)) {
            while (fileInputStream.available() > 0) {
                 resultMessage.append((char)fileInputStream.read());
            }
        }  catch (IOException e) {
            System.out.println("Houston, we have problems... " + e.getMessage());
        }

        return resultMessage;
    }

    public static void writeDataToFile(String pathToFile, String content) {
        try (FileWriter fileWriter = new FileWriter(pathToFile)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
