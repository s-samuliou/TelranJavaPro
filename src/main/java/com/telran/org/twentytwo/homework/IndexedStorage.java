package com.telran.org.twentytwo.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Task 2 with *
public class IndexedStorage<T> {
    private Map<T, List<Integer>> elements;

    public IndexedStorage() {
        this.elements = new HashMap<>();
    }

    public void addElement(T element, int index) {
        if (this.elements.containsKey(element)) {
            this.elements.get(element).add(index);
        } else {
            List<Integer> newIndexList = new ArrayList<>();
            newIndexList.add(index);
            this.elements.put(element, newIndexList);
        }
    }

    public Map<T, List<Integer>> getElements() {
        return this.elements;
    }
}
