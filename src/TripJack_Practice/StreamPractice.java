package TripJack_Practice;

import TripJack_Stream.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 5000, "IT"),
                new Employee("Bob", 25, 4000, "IT"),
                new Employee("Charlie", 35, 6000, "IT"),
                new Employee("David", 28, 4500, "HR"),
                new Employee("Eve", 40, 7000, "HR")
        );

        List<String> empName = employees.stream().map(Employee::getName).toList();
        System.out.println(empName);

        Map<String, List<Employee>> groupedByDept = employees.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(groupedByDept);

        Map<String, Optional<Employee>> maxSalaryInEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(maxSalaryInEachDept);

        List<Employee> descendingOrder = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
        System.out.println(descendingOrder);

        Map<String, Double> averageSalaryPerDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println("Average salary per department: " + averageSalaryPerDept);

    }
}
