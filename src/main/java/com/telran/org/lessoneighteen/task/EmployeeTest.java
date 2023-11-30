package com.telran.org.lessoneighteen.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alex", "Developer", 1500),
                new Employee("Tomas", "Manager", 680.50),
                new Employee("Thea", "CEO", 5000),
                new Employee("Mary", "Manager", 700),
                new Employee("Ken", "Developer", 900));

        List<Employee> listSalary = employeeList.stream()
                .filter(x -> x.getSalary() > 1000)
                .collect(Collectors.toList());

        System.out.println(listSalary);

        Optional<Employee> min = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(min.get());
    }
}
