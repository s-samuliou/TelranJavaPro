package com.telran.org.lessonfour.homeworkfour;

public class Player {
    private Card[] hand;

    public Player() {
        hand = new Card[5];  // Each player has 5 cards
    }

    public void receiveCard(int index, Card card) {
        hand[index] = card;
    }

    public void displayHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();
    }
}
