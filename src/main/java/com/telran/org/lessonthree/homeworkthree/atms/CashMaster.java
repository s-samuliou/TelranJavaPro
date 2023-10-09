package com.telran.org.lessonthree.homeworkthree.atms;

import com.telran.org.lessonthree.homeworkthree.ATM;
import com.telran.org.lessonthree.homeworkthree.Converter;
import com.telran.org.lessonthree.homeworkthree.CreditCard;

import java.util.Objects;

public class CashMaster extends ATM implements Converter {
    private final double conversionRate = 1.1;
    private String currencyType;
    public CashMaster(String nameATM, int balance, String currencyType) {
        super(nameATM, balance);
        this.currencyType = currencyType;
    }

    @Override
    public void withdrawBalance(CreditCard creditCard, int amount) {            //At the beginning, I check whether
        if (!Objects.equals(creditCard.getCurrencyType(), this.currencyType)) { //the card is suitable for the ATM according to the type of
            amount = convert(amount);                                           //currency. If it fits - nothing happens, if not - conversion
            System.out.println("New converted sum for withdraw(EUR->USD): " + amount + " USD");
        }

        if (this.getBalance() > amount) {
            if (creditCard.getBalance() > 0 && creditCard.getBalance() > amount) {
                creditCard.setBalance(creditCard.getBalance() - amount);
                this.setBalance(this.getBalance() - amount);

                System.out.println("Funds withdrawn successfully!");
            } else {
                System.out.println("~Insufficient funds on the card~");
            }
        } else {
            System.out.println("~Insufficient funds in ATM~");
        }
    }

    @Override
    public void depositBalance(CreditCard creditCard, int amount) {
        if (amount > 0) {
            creditCard.setBalance(creditCard.getBalance() + amount);
            System.out.println("Funds have been successfully added to the card!");
        }
    }

    @Override
    public boolean checkPin(CreditCard creditCard, int pin) {
        if (creditCard == null) {
            return false;
        }

        return creditCard.getPin() == pin;
    }

    @Override
    public int convert(int eur) {
        return (int)(eur*conversionRate);
    }
}
