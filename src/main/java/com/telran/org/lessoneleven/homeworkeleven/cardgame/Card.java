package com.telran.org.lessoneleven.homeworkeleven.cardgame;

import com.telran.org.lessoneleven.homeworkeleven.cardgame.enums.Rank;
import com.telran.org.lessoneleven.homeworkeleven.cardgame.enums.Suit;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return suit + " of " + rank;
    }
}
