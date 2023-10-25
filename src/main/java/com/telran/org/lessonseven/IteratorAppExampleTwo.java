package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAppExampleTwo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }

        System.out.println(integerList);

//        for (Integer e : integerList) {
//            if (e % 2 != 0) {
//                integerList.remove(e);
//            } Тут мы перибираем саму коллекцию поэтому удаление не работоет
//        }так нельзя делать - перебирать саму коллекцию и удалять

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 != 0) {
                integerList.remove(i);
            } //тут всё норм, тк мы перебираем индексы коллекции, а не саму коллекцию
        }

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 != 0) {
                System.out.println(element + " ");
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println(integerList);
    }

}
