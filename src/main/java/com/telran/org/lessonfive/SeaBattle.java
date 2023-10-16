package com.telran.org.lessonfive;

import java.util.Arrays;

public class SeaBattle {

    private static final int FIELD_LENGTH = 10;

    public static void main(String[] args) {
        char[][] playerOneField = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerTwoField = new char[FIELD_LENGTH][FIELD_LENGTH];

        printField(playerOneField);

        fillField(playerOneField);
        fillField(playerTwoField);

        startGame(playerOneField, playerTwoField, "One", "Two");
    }

    private static void startGame(char[][] playerOneField, char[][] playerTwoField, String one, String two) {

    }

    private static void fieldByDefault(char[][] field) {
        for (char[] chars : field) {
            Arrays.fill(chars, '.');
        }
    }

    private static void printField(char[][] field) {
        for (char[] ints : field) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }

    private static void fillField(char[][] field) {

    }
}
