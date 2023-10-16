package com.telran.org.lessonfour;

import java.util.Scanner;

public class EnumApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input current day: ");
        String dayAsString = scanner.nextLine().toUpperCase();
        Day input = null;

        for(Day value : Day.values()) {
            if (dayAsString.equals(value.name())) {
                input = Day.valueOf(dayAsString);
            }
        }
        if (input == null) {
            throw new UnsupportedOperationException();
        }

        switch (input) {
            case FRIDAY:
                System.out.println("Hurrrrraa");
                break;
            case MONDAY:
                System.out.println("Nooooo");
                break;
            default:
                System.out.println("Other");
        }

    }

    public static void printAllDays() {
        Day[] values = Day.values();

        for (Day value : values) {
            System.out.println(value);
        }
    }
}
