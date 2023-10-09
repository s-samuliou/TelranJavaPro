package com.telran.org.lessonthree.homeworkthree;

import com.telran.org.lessonthree.homeworkthree.atms.CashMaster;
import com.telran.org.lessonthree.homeworkthree.atms.EasyCash;
import com.telran.org.lessonthree.homeworkthree.atms.MoneyMate;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        EasyCash easyCashATM = new EasyCash("EasyCash ATM", 10000);
        MoneyMate moneyMateATM = new MoneyMate("MoneyMate ATM", 10000);
        CashMaster cashMasterATM = new CashMaster("CashMaster ATM", 10000, "USD");
        EasyCash easyCashATM2 = new EasyCash("EasyCash ATM v.2", 15000);

        ATM[] atms = {easyCashATM, moneyMateATM, cashMasterATM, easyCashATM2};

        CreditCard creditCard = new CreditCard(
                "0000 0000 0000 0001",
                1111,
                1000,
                "EUR");

        for (ATM atm : atms) {
            if (atm instanceof Converter) {
                System.out.print("\nYou can withdraw money from this ATM: " + atm.getNameATM() +
                        "\nEnter pin: ");
                int userInputPin = in.nextInt();

                if (atm.checkPin(creditCard, userInputPin)) {
                    System.out.print("Success, you are in the system!\n" +
                            "Enter the withdraw sum: ");
                                                                    //I use the conversion method
                    int userInputSum = in.nextInt();                // in the withdrawBalance() method itself,
                    atm.withdrawBalance(creditCard, userInputSum);  // go to it to see the explanation(class - CashMaster)
                } else {
                    System.out.println("~You entered an incorrect PIN~");
                }
            } else {
                System.out.println("\nYou canNOT withdraw money from this ATM: " + atm.getNameATM());
            }
        }

        System.out.println("\n" + cashMasterATM +
                "\n" + easyCashATM +
                "\n" + moneyMateATM +
                "\n" + easyCashATM2);

        System.out.println(creditCard);
    }
}
