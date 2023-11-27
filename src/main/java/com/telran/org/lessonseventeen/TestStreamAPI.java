package com.telran.org.lessonseventeen;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPI {

    //Example
    //Collection.stream().Intermediate().Intermediate().Intermediate()......Terminal();

    //Intermediate
    // 1. filter(Predicate) - filter by true
    // 2. sorted() - sort elements
    // 3. limit() - limit of element
    // 4. skip(n) - skip n elements
    // 5. distinct() - get only unique elements
    // 6. peek() - like forEach, but u can do some actions after this method
    // 7. map(Function) - convert one element to other
    // 8. flatmap() - unpack collection

    //Terminal
    // 1. count() - count of elements in stream
    // 2. collect() (Collectors.toList())
    // 3. forEach() - make action for each element
    // 4.

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,4,5,3,1,6,7,8);

        int count = 0;
        for (Integer value : integerList) {
            if (value % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count: " + count);

        //Predicate<Integer> predicate = integer -> integer % 2 != 0;
        long result = integerList.stream().filter(integer -> integer % 2 != 0).count();

        //sorted & limit
        List<Integer> collect = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted: " + collect);

        //sorted & limit
        List<Integer> resLimit = integerList.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Sorted and limit: " + resLimit);

        //sorted & skip
        List<Integer> resSkip = integerList.stream().sorted().skip(3).collect(Collectors.toList());
        System.out.println("Sorted & skip: " + resSkip);

        //distinct
        List<Integer> distinct = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct collection: " + distinct);

        //forEach
        integerList.stream().forEach(integer -> System.out.println(" " + integer));

        List<Integer> evenSortedList = integerList.stream()
                .filter(integer -> integer % 2 == 0).sorted()
                .peek(integer -> System.out.print(" " + integer))
                .sorted().collect(Collectors.toList());
    }

    private long getCountOddElements(List<Integer> list) {
        return list.stream()
                .filter(integer -> integer % 2 != 0)
                .count();
    }
}
