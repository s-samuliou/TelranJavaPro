package com.telran.org.lessonsix.hwr;

public class BankApp {

    public static void main(String[] args) {
        CreditCard card = new CreditCard(1000, Currency.EUR);
        CreditCard cardUSD = new CreditCard(1000, Currency.USD);
        CreditCard cardUNI = new CreditCard(500, null);

        checkCurrency(card);
        checkCurrency(cardUSD);
        checkCurrency(cardUNI);
    }

    private static void checkCurrency(CreditCard card) {
        if (Currency.EUR.equals(card.getCurrency())) {
            System.out.println("Is is ok");
        } else {
            System.out.println("Wrong card");
        }
    }
}
