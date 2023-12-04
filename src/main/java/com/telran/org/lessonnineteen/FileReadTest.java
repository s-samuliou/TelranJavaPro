package com.telran.org.lessonnineteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadTest {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessonnineteen";

        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFile + "\\file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile + "\\fileNew.txt");

            int data = fileInputStream.read();

            while (data != -1) {
                //System.out.print((char)data);
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
