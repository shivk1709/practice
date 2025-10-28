package TripJack_Stream;

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

        List<String> sortBasedOnTheLengthOfName = employees.stream().sorted(Comparator.comparingInt(e -> e.getName().length())).map(Employee::getName).toList();
        System.out.println(sortBasedOnTheLengthOfName);

        Map<String, List<Employee>> groupedByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupedByDept);

        Map<String, List<String>> collectByNameByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collectByNameByDepartment);
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

        Map<String, Integer> departmentScores = Map.of(
                "HR", 70,
                "IT", 90,
                "Finance", 80,
                "HR", 85,       // Map.of me duplicate key allowed nahi, so real example me use HashMap
                "IT", 95
        );

//        departmentScores.forEach((department, scores) -> {
//            double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0);
//            int max = scores.stream().mapToInt(Integer::intValue).max().orElse(0);
//            int min = scores.stream().mapToInt(Integer::intValue).min().orElse(0);
//
//            System.out.println(department + " -> Avg: " + average + ", Max: " + max + ", Min: " + min);
//        });


    }
}
