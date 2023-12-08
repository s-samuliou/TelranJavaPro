package com.telran.org.lessontwenty;

public class CustomReader implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Hello from close method ;)");
    }
}
