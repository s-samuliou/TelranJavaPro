package com.telran.org.twentytwo.homework;

import java.util.HashMap;
import java.util.Map;

public class Storage<T>{

    private Map<T, Integer> elements;

    public Storage() {
        this.elements = new HashMap<>();
    }

    public void addElement(T element) {
        if (this.elements.containsKey(element)) {
            this.elements.put(element, this.elements.get(element) + 1);
        } else {
            this.elements.put(element, 1);
        }
    }

    public Map<T, Integer> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "elements= " + elements +
                " }";
    }
}
