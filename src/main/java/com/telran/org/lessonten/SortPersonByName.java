package com.telran.org.lessonten;

import java.util.Comparator;
import java.util.Objects;

public class SortPersonByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
