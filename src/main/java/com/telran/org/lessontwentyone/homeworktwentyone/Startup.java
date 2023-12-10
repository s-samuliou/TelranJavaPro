package com.telran.org.lessontwentyone.homeworktwentyone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Startup {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the task number (1, 2, or 3):");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                isValidPhoneNumber();
                break;
            case 2:
                isValidEmail();
                break;
            case 3:
                isValidPassword();
                break;
            default:
                System.out.println("Invalid task number");
                break;
        }

        scanner.close();
    }

    private void isValidPhoneNumber() {
        String regex = "(\\d{7}|\\d{3}[-\\s]\\d{4})";

        List<String> phoneNumbers = Arrays.asList(
                "7777777",
                "29-12200",
                "123 4567",
                "121-9090"
        );

        Pattern pattern = Pattern.compile(regex);

        phoneNumbers.forEach(number -> {
                    Matcher matcher = pattern.matcher(number);

                    if (matcher.matches()) {
                        System.out.println(number + " is a valid phone number");
                    } else {
                        System.out.println(number + " is NOT a valid phone number");
                    }
                });
    }

    private void isValidEmail () {
        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9._)]+$";

        List<String> emails = Arrays.asList(
                "example@email.com",
                "invalid_email",
                "another@example.com"
        );

        Pattern pattern = Pattern.compile(regex);

        emails.forEach(email -> {
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println(email + " is a valid email address");
            } else {
                System.out.println(email + " is NOT a valid email address");
            }
        });
    }

    private void isValidPassword() {
        String regex = "[A-Za-z0-9+-._]{8}";

        List<String> passwords = Arrays.asList(
                "12Dqw+_9",
                "1234567",
                "Qw.rty1-",
                "Hi12_+21"
        );

        Pattern pattern = Pattern.compile(regex);

        passwords.forEach(password -> {
            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println(password + " is a valid password");
            } else {
                System.out.println(password + " is NOT a valid password");
            }
        });
    }
}
