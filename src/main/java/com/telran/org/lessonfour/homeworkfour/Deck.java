package com.telran.org.lessonfour.homeworkfour;

import com.telran.org.lessonfour.homeworkfour.enums.Rank;
import com.telran.org.lessonfour.homeworkfour.enums.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final Card[] cards;

    public Deck() {
        List<Card> deck = new ArrayList<>();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        for (Rank rank : ranks) {
            for (Suit suit : suits) {
                deck.add(new Card(suit, rank));
            }
        }

        this.cards = deck.toArray(new Card[0]);
    }

    public void shuffle(Random random) {
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    public Card[] getCards() {
        return cards;
    }
}
