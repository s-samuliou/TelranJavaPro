package com.telran.org.lessonthree.homeworkthree;

public abstract class ATM {
    private String nameATM;
    private int balance;

    public ATM(String nameATM, int balance) {
        this.nameATM = nameATM;
        this.balance = balance;
    }

    public String getNameATM() {
        return nameATM;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void withdrawBalance(CreditCard creditCard, int amount);

    public abstract void depositBalance(CreditCard creditCard, int amount);

    public abstract boolean checkPin(CreditCard creditCard, int pin);

    @Override
    public String toString() {
        return "ATM{" +
                "nameATM='" + nameATM + '\'' +
                ", balance=" + balance +
                '}';
    }
}
