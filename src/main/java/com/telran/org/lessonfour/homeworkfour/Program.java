package com.telran.org.lessonfour.homeworkfour;

import com.telran.org.lessonfour.homeworkfour.enums.Rank;
import com.telran.org.lessonfour.homeworkfour.enums.Suit;

import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);
        final Random random = new Random();

        final int numberOfCards = Suit.values().length * Rank.values().length; // number of cards

        while (true) {
            System.out.print("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        // deck initialization
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < Suit.values().length; j++) {
                deck[Suit.values().length * i + j] = Rank.values()[i] + " " + Suit.values()[j];
            }
        }

        // deck shuffling
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }

        // the shuffled deck is displayed
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
