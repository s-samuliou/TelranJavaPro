package com.telran.org.lessonfifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alex", "Admin", 32),
                new User("Olrg", "Member", 22),
                new User("Maxim", "Member", 32)
        );

        Predicate<User> adminPredicate = user -> "Admin".equals(user.getRole());
        List<User> adminList = collect(users, adminPredicate);

        Predicate<User> memberPredicate = user -> "Member".equals(user.getRole());
        List<User> memberList = collect(users, memberPredicate);

        Predicate<User> ageUserPredicate = user -> user.getAge() > 30;
        List<User> ageUserList = collect(users, ageUserPredicate);

        System.out.println("Admin users: " + adminList);
        System.out.println("Member users: " + memberList);
        System.out.println("Old users: " + ageUserList);
    }

    private static List<User> collect(List<User> users, Predicate<User> predicate) {
        List<User> result = new ArrayList<>();

        for (User user : users) {
            if (predicate.test(user)) {
                result.add(user);
            }
        }

        return result;
    }
}
