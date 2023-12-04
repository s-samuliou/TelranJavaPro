package com.telran.org.lessonnineteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInputList {

    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessonnineteen";

        /*InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = null;

        try {
            text = bufferedReader.readLine();
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(text);
    }
}
