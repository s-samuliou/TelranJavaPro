package com.telran.org.lessonsixteen;

import com.telran.org.lessoneleven.homeworkeleven.cardgame.enums.Rank;

import java.util.Random;
import java.util.function.*;

public class TestSupplier {

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();

        IntSupplier intSupplier = () -> random.nextInt();
        System.out.println(intSupplier.getAsInt());

        DoubleSupplier doubleSupplier = () -> random.nextDouble();
        System.out.println(doubleSupplier.getAsDouble());

        LongSupplier longSupplier = () -> random.nextLong();
        System.out.println(longSupplier.getAsLong());

        BooleanSupplier booleanSupplier = () -> random.nextBoolean();
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
