package com.telran.org.lessonnineteen;

import java.io.*;
import java.util.Scanner;

public class BufferFileTest {

    public static void main(String[] args) throws Exception {
        String pathToFile = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessonnineteen";
        FileInputStream fileInputStream = new FileInputStream(pathToFile + "\\file.txt");

        /*InputStream in = fileInputStream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        reader.lines().forEach(System.out::println);
        reader.close();*/

        Scanner scanner = new Scanner(fileInputStream);
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();
    }
}
