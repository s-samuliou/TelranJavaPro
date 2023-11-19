package com.telran.org.lessonfifteen;

public class MultiplayerImpl implements Multiplayer {
    @Override
    public void multiply(int value) {
        value *= 2;
        System.out.println("Result value * 2: " + value);
    }
}
