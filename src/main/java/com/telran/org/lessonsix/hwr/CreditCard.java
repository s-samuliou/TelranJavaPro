package com.telran.org.lessonsix.hwr;

public class CreditCard {
    private int amount;
    private Currency currency;

    public CreditCard(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}
