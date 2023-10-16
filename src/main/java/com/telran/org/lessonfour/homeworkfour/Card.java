package com.telran.org.lessonfour.homeworkfour;

import com.telran.org.lessonfour.homeworkfour.enums.Rank;
import com.telran.org.lessonfour.homeworkfour.enums.Suit;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
