package com.telran.org.twentytwo.example;

public class StudentConverter implements Converter<Student, StudentDto>{
    @Override
    public StudentDto toDto(Student person) {
        return null;
    }

    @Override
    public Student roObject(StudentDto personDto) {
        return null;
    }
}
