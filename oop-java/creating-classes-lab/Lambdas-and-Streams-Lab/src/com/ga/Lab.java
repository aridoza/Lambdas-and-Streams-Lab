package com.ga;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;

public class Lab {
    private List<Employee> employees = Arrays.asList(
            new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), 68_109.00, "Male"),
            new Employee("Sheryl Sandberg", LocalDate.of(2014, 7, 1), 87_846.00,"Female"),
            new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), 95_035.00, "Male"),
            new Employee("Susan Wojcick", LocalDate.of(2015, 6, 1), 37_210.00, "Female"),
            new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), 48_450.00, "Male"),
            new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), 74_416.00, "Male")
    );


    private <T> void printList(List<T> list) {
        list.forEach(item -> System.out.println(item));
    }

    @Test
    public void getEmployeesOver50k() {
        List<Employee> allEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .collect(Collectors.toList());
        printList(allEmployees);
    }

    @Test
    public void getEmployeeNamesHiredAfter2012() {
        List<String> allEmployees = employees.stream()
                .filter(employee -> employee.getHireDate().isAfter(LocalDate.of(2012,12,31)))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        printList(allEmployees);
    }

    @Test
    public void getMaxSalary() {
        double max = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);
        System.out.println("Max:" + max);

    }

    @Test
    public void getMinSalary() {
        double min = employees.stream()
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0);
        System.out.println("Min:" + min);
    }

    @Test
    public void getAverageSalaries() {
        double averageMale = employees.stream()
                .filter(employee -> employee.getGender() == "Male")
                .mapToDouble(Employee::getSalary)
                .average().getAsDouble();
                //.mapToDouble(employee -> employee.getSalary())
                //.average()
                //.getAsDouble();
        double averageFemale = employees.stream()
                .filter(employee -> employee.getGender() == "Female")
                .mapToDouble(Employee::getSalary)
                .average().getAsDouble();

        System.out.println("Averages: Male:" + averageMale + " Female:" + averageFemale);
        System.out.println("Averages: Male:" + averageMale + " Female:" + averageFemale);
    }

    @Test
    public void getMaximumPaidEmployee() {
        Employee highest = employees.stream()
                .reduce((employee1, employee2) -> employee1.getSalary() > employee2.getSalary() ? employee1 : employee2)
                .orElse(null);

        System.out.println(highest);
    }
}
