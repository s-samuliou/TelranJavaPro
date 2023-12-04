package com.telran.org.lessonnineteen;

import javax.xml.crypto.Data;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class IOStreamTest {

    public static void main(String[] args) {
        // System.out
        OutputStream out = System.out;
        System.out.println("Hello"); // standard stream for output
        System.out.print("Hello");
        System.out.println();
        System.out.printf("%b%n", null);

        int x = 100;
        System.out.printf("Print integer: x = %d\n", x);

        float y = 3.14f;
        System.out.printf("Print float: y = %.6f\n", y);

        Date date = new Date();
        System.out.printf("Hours: %tH\nMinutes: %tM\nSeconds:%tS", date, date, date);

        // System.in
        InputStream in = System.in; // standard stream for input
        Scanner scanner = new Scanner(in);

        //System.error
        PrintStream err = System.err;
        System.err.println("Hello world");


    }
}
