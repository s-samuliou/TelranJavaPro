package com.telran.org.lessonseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamTerminal {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("10", "20", "10", "30", "50");

        List<String> collect = stringList.stream()
                .filter(string -> "10".equals(string))
                .collect(Collectors.toList());
        System.out.println(collect);

        //for Stream
        //findFirst - get first element(return Optional)
        String result = stringList.stream()
               .filter(string -> "0".equals(string))
                .findFirst()
                .orElse("100");
        System.out.println(result);

        //Collect
        List<String> collect1 = stringList.stream().collect(Collectors.toList());

        //anyMatch
        boolean resultMatch = stringList.stream().anyMatch(x -> x.equals("50"));
        System.out.println(resultMatch);

        //allMatch
        System.out.println("all match result: " + stringList.stream()
                .allMatch(string -> string.equals("10")));

        //min, max
        System.out.println("min result: " + stringList.stream()
                .min(String::compareTo));
        //forEach

        //toArray
        String[] array = stringList.stream()
                .toArray(String[]::new);

        //reduce
        Optional<String> reduce = stringList.stream()
                .reduce((s1, s2) -> s1 + "-" + s2);
        System.out.println(reduce.get());

        List<Integer> integers = Arrays.asList(2, 3, 4, 5);
        Optional<Integer> resultSum = integers.stream().reduce((a, b) -> a + b);
        System.out.println(resultSum.get());
    }
}
