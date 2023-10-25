package com.telran.org.lessonfourAdd;

import com.telran.org.lessonfour.ChildTwo;
import com.telran.org.lessonfour.MiddleChild;
import com.telran.org.lessonfour.Parent;

public class LessonAdd {
    public static void main(String[] args) {
        Parent parent = new MiddleChild();
        parent.printGreetings();
        parent.printThanks();

    }
}
