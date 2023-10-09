package com.telran.org.lessonthree.homeworkthree.atms;

import com.telran.org.lessonthree.homeworkthree.ATM;
import com.telran.org.lessonthree.homeworkthree.CreditCard;

public class MoneyMate extends ATM {
    public MoneyMate(String nameATM, int balance) {
        super(nameATM, balance);
    }

    @Override
    public void withdrawBalance(CreditCard creditCard, int amount) {
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
}
