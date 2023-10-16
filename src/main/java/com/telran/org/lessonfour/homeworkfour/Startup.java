package com.telran.org.lessonfour.homeworkfour;

import com.telran.org.lessonfour.homeworkfour.enums.Rank;
import com.telran.org.lessonfour.homeworkfour.enums.Suit;

import java.util.Random;
import java.util.Scanner;

public class Startup {
    public static void startGame(int cardsForPlayer) {
        int players = promptForNumberOfPlayers(cardsForPlayer);

        Card[] deck = createDeck(); // Create the deck
        shuffle(deck); // Shuffle the deck

        Player[] playersArray = new Player[players]; // Create an array of players
        for (int i = 0; i < players; i++) {
            playersArray[i] = new Player();
        }

        dealCards(deck, playersArray, cardsForPlayer); // Deal cards to players
        displayPlayerHands(playersArray); // Display players' hands
    }

    private static int promptForNumberOfPlayers(int cardsForPlayer) {
        Scanner sc = new Scanner(System.in);
        int numberOfCards = Suit.values().length * Rank.values().length;

        int players;
        while (true) {
            System.out.println("Enter the number of players: ");

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
        return players;
    }

    private static Card[] createDeck() { // Create the deck
        Card[] deck = new Card[Suit.values().length * Rank.values().length];
        int index = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                deck[index++] = new Card(suit, rank);
            }
        }
        return deck;
    }

    private static void shuffle(Card[] deck) { // Shuffle the deck
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }


    private static void dealCards(Card[] deck, Player[] players, int cardsForPlayer) { // Deal cards to players
        int index = 0;
        for (int i = 0; i < cardsForPlayer; i++) {
            for (Player player : players) {
                player.receiveCard(i, deck[index++]);
            }
        }
    }

    private static void displayPlayerHands(Player[] players) { // Display players' hands
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s hand:");
            players[i].displayHand();
        }
    }
}
