package com.telran.org.lessoneighteen.homeworkeighteen;

import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.*;
import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.studentdirection.BackEndStudent;
import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.studentdirection.FrontEndStudent;
import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.studentdirection.QAStudent;

import java.util.*;

public class Startup {

    public void start() {
        taskOne();
        taskTwo();
        taskThree();
    }

    public void taskOne() {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        List<String> sortedUniqueForward = list.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("Direct sorting and removing duplicates: " + sortedUniqueForward);

        List<String> sortedUniqueBackward = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Reverse sorting and removing duplicates: " + sortedUniqueBackward);
    }

    public void taskTwo() {
        List<String> list =  Arrays.asList("a1", "b5", "a2", "b4");

        Optional<String> min = list.stream()
                .min(String::compareTo);

        System.out.println("Min is: " + min);
    }

    public void taskThree() {
        List<Student> frontEndStudents = generateStudents(5, ClassType.FE);
        List<Student> backEndStudents = generateStudents(5, ClassType.BA);
        List<Student> qaStudents = generateStudents(5, ClassType.QA);

        List<List<Student>> allStudents = Arrays.asList(frontEndStudents, backEndStudents, qaStudents);

        List<ProjectStudent> projectStudents = allStudents.stream()
                .flatMap(List::stream)
                .filter(student -> student.getRate() > 4.5 && student.isFinished())
                .map(student -> {
                    ClassType studentType;
                    if (student instanceof FrontEndStudent) {
                        studentType = ClassType.FE;
                    } else if (student instanceof BackEndStudent) {
                        studentType = ClassType.BA;
                    } else {
                        studentType = ClassType.QA;
                    }
                    return new ProjectStudent(student.getName(), student.getRate(), studentType);
                })
                .peek(System.out::println)
                .toList();
    }

    private static List<Student> generateStudents(int count, ClassType type) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            double rate = 3 + random.nextDouble() * 2; // Generating a random rating from 0 to 5
            boolean finished = random.nextBoolean(); // Generating a random course completion flag
            String name = "Student" + i;

            switch (type) {
                case FE:
                    students.add(new FrontEndStudent(name, rate, finished));
                    break;
                case BA:
                    students.add(new BackEndStudent(name, rate, finished));
                    break;
                case QA:
                    students.add(new QAStudent(name, rate, finished));
                    break;
            }
        }

        return students;
    }
}
