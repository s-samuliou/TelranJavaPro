package com.telran.org.lessoneleven.homeworkeleven.cardgame;

import com.telran.org.lessoneleven.homeworkeleven.cardgame.enums.Rank;
import com.telran.org.lessoneleven.homeworkeleven.cardgame.enums.Suit;

import java.util.Random;
import java.util.Stack;

public class Solitare {
    public void startGame() {
        Card[] deck = createDeck(); // Create the deck
        shuffle(deck); // Shuffle the deck

        Stack<Card> finalDeck = removeAdjacentSameSuitCards(deck); // Remove adjacent same suit cards

        showDeck(finalDeck); // Show final deck
    }

    private Stack<Card> removeAdjacentSameSuitCards(Card[] deck) {
        Stack<Card> stack = new Stack<>();

        for (Card element : deck) {
            if (stack.isEmpty()) {
                stack.push(element);
                continue;
            }

            if (stack.peek().getSuit().equals(element.getSuit())) {
                stack.pop();
            } else {
                stack.push(element);
            }
        }

        return stack;
    }

    private Card[] createDeck() { // Create the deck
        Card[] deck = new Card[Suit.values().length * Rank.values().length];
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[index++] = new Card(suit, rank);
            }
        }
        return deck;
    }

    private void shuffle(Card[] deck) { // Shuffle the deck
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }

    private void showDeck(Stack<Card> deck) {
        int counter = 1;
        for (Card card : deck) {
            System.out.println(counter + " " + card);
            counter++;
        }
    }
}
