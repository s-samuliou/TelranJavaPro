package com.telran.org.lessontwenty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTryWR {

    public static void main(String[] args) {
        // try-with resources

        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */

        try (CustomReader reader = new CustomReader()) {
            System.out.println("Hi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
