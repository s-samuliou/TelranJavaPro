package com.telran.org.lessonfour;

public class ATMApp {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setCurrencyType(Currency.EUR);

        CreditCard creditCardTwo = new CreditCard();
        creditCardTwo.setCurrencyType(Currency.EUR);

        checkCurrency(creditCard);
        checkCurrency(creditCardTwo);
    }

    public static void checkCurrency(CreditCard credutCard) {
        if (Currency.EUR == (credutCard.getCurrencyType())) {
            System.out.println("It's EUR");
        }
    }
}
