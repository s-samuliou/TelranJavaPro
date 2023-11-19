package com.telran.org.lessonfifteen;

public class TestFuncInterface {

    public static void main(String[] args) {
        Multiplayer multiplayerTwo = new Multiplayer() {
            @Override
            public void multiply(int value) {
                value *= 10;
                System.out.println("Result value * 10: " + value);
            }
        };

        multiplayerTwo.multiply(4);

        Multiplayer multiplayerThree = value -> {
            System.out.println("Result value * 10: " + value * 10);
        };

        multiplayerThree.multiply(6);

        Printer printer = () -> System.out.println("Hello World");

        PrinterAddon printerAddon = (one, two) ->
        {
            System.out.println(" " + one + " " + two);
        };
        printerAddon.print("Hello", "WorldTe");
    }
}
