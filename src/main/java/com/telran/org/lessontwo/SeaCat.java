package com.telran.org.lessontwo;

public class SeaCat extends BigCat {

    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void voice() {
        System.out.println("SeaCat say meaaw");
    }
}
