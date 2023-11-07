package com.telran.org.lessoneleven;

import java.util.Stack;

public class StackTask {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'a', 'c', 'a'};
        //ca
        //abbaca
        //aaca
        //ca

        Stack<Character> stack = new Stack<>();

        for (char element : chars) {
            if (stack.isEmpty()) {
                stack.push(element);
                continue;
            }

            if (stack.peek() == element) {
                stack.pop();
            } else {
                stack.push(element);
            }
        }

        System.out.println(stack);

    }
}
