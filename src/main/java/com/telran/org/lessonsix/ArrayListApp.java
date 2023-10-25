package com.telran.org.lessonsix;

import com.telran.org.lessonsix.hwr.CreditCard;
import com.telran.org.lessonsix.hwr.Currency;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApp {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2); //add - add element to the end of the list
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1,6); //insert element to certain index
        System.out.println(list);
        System.out.println("Size of list: " + list.size()); //size() - real size of list
        System.out.println(list.get(1)); //get(int index) - det element by index

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element by index: " + i + " = " + list.get(i));
        }

        for (Integer element : list) {
            System.out.println("Element = " + element);
        }

        list.remove(1); // delete element bu index
        list.remove(Integer.valueOf(5));

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(null);
        System.out.println(stringList);

        //CreditCard cardOne = new CreditCard(1000, Currency.EUR);
        //CreditCard cardTwo = new CreditCard(1000, Currency.EUR);

        List<CreditCard> creditCardList = new ArrayList<>();
        creditCardList.add(new CreditCard(1000, Currency.EUR));
        creditCardList.add(new CreditCard(2000, Currency.USD));
        System.out.println(creditCardList);

        List<CreditCard> creditCards = List.of(new CreditCard(1000, Currency.EUR),
        new CreditCard(2000, Currency.EUR),
        new CreditCard(1000, Currency.USD));
        System.out.println(creditCardList);
    }
}
