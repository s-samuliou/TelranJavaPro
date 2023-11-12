package com.telran.org.lessontwelve;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TestStudentHashMap {

    public static void main(String[] args) {
        Map<Student, List<Course>> studentCoursesMap = new HashMap<>();

        Student alex = new Student("Alex", "Alexeev");
        Student maxim = new Student("Maxim", "Maximov");

        Course java = new Course("Java", 105);
        Course sql = new Course("SQL", 30);
        Course algo = new Course("Algo", 30);

        List<Course> alexCourses = List.of(java, algo);
        List<Course> maximCourses = List.of(sql, algo);

        studentCoursesMap.put(alex, alexCourses);
        studentCoursesMap.put(maxim, maximCourses);

        printMap(studentCoursesMap);

        Student oleg = new Student("Oleg", "Olegov");

        alex.setSurname("Petrov");

        List<Course> courses = studentCoursesMap.get(alex);
        System.out.println("Courses for Alex by key: " + courses);

        printMap(studentCoursesMap);

        if (studentCoursesMap.containsKey(oleg)) {
            List<Course> coursesOleg = studentCoursesMap.get(oleg);
            System.out.println("Courses for Oleg by key: " + coursesOleg);
            System.out.println("Count of courses for Oleg " + coursesOleg.size());
        }

        StudentWithId studentWithId = new StudentWithId("Alex", "Alexeev", 1);
        StudentWithId studentWithId2 = new StudentWithId("Alex", "Alexeev", 2);


    }

    private static void printMap(Map<Student, List<Course>> studentCoursesMap) {
        studentCoursesMap.forEach((student, coursesList) -> {
            System.out.println("Courses for student " + student.getName() + " " +
                    student.getSurname());

            coursesList.forEach(course -> {
                System.out.println("Course name " + course.getName() + " , hours " +
                        course.getHours());
            });

            System.out.println();
        });
    }
}
