package Stream;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice_1809
{
    public static void main(String[] args)
    {

        List<String> names = List.of("Alice", "alex", "Ed", "edgar", "Ian", "Oscar", "uma", "Uma");

        List<String> vowelsWithMoreThan31 = names.stream().filter(name -> name.length() > 3).filter(name -> "aeiou".indexOf(Character.toLowerCase(name.charAt(0))) != -1).toList();

        List<String> vowelsWithMoreThan3 = names.stream()
                .filter(name -> name.length() > 3 && ("aeiou".indexOf(Character.toLowerCase(name.charAt(0))) > 0))
                .toList();

        System.out.println(vowelsWithMoreThan3);

        List<Integer> numbers = Arrays.asList(3, 6, 2, 7, 8, 9);

        List<Integer> squares = numbers.stream().filter(number -> number % 2 == 0).map(number -> number * number).toList();
        System.out.println(squares);

        List<Person> persons = Arrays.asList(new Person("Mahesh", 30, 20000),
                new Person("Suresh", 20, 40000),
                new Person("Jitesh", 40, 50000),
                new Person("Naresh", 50, 90000),
                new Person("Nitin", 50, 90000),
                new Person("Saitraj", 50, 90000),
                new Person("Bhavtesh", 45, 2000000),
                new Person("Bhuvnesh", 10, 100000));

        List<String> personWith30Age = persons.stream().filter(person -> person.getAge() > 30).map(Person::getName).toList();

        Map<Character, List<String>> personMap = persons.stream().collect(Collectors.groupingBy(person -> person.getName().charAt(0), Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println(personMap + "jhdbf");

        Optional<Person> person = persons.stream().max(Comparator.comparingInt(Person::getAge));

        Person personWithMaxSalary = persons.stream().max(Comparator.comparingInt(Person::getSalary)).get();

        List<Person> sortedPersonList = persons.stream().sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName)).toList();
        Collections.sort(persons, Comparator.comparingInt(Person::getAge).reversed().thenComparing(Person::getName));

        Person personWithSecondHighestSalary = persons.stream().distinct().sorted(Comparator.comparingInt(Person::getSalary).reversed()).skip(1).findFirst().orElse(null);

        System.out.println(personWithMaxSalary);
        System.out.println(personWithSecondHighestSalary);

        List<Person> personList = persons.stream().sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName)).toList();
        System.out.println(personList);

        Collections.sort(persons, Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        List<String> words = Arrays.asList("Shiv", "Mahak", "Shiv", "Mahi", "Mahak", "Mansi", "Manya");

        Map<String, Long> occurencesOfWords = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurencesOfWords);

        Map<String, List<String>> occurences = words.stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(occurences);

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000, "alice@example.com", LocalDate.of(2020, 5, 10)),
                new Employee(2, "Bob", "IT", 75000, "bob@example.com", LocalDate.of(2021, 3, 15)),
                new Employee(3, "Charlie", "Finance", 62000, "charlie@example.com", LocalDate.of(2019, 8, 22)),
                new Employee(4, "David", "Marketing", 58000, "david@example.com", LocalDate.of(2022, 1, 5)),
                new Employee(5, "Eva", "IT", 80000, "eva@example.com", LocalDate.of(2018, 11, 30))
        );

        Map<String, List<Employee>> empByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empByDept);

        Map<String, List<String>> empNameByDpt = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(empNameByDpt);

        List<String> employeesName = employees.stream().map(employee -> employee.getName().toUpperCase()).sorted(Comparator.comparingInt(String::length).reversed()).toList();
        System.out.println(employeesName);

        List<String> sortedNames = employees.stream().map(employee -> employee.getName().toUpperCase()).sorted().toList();
        System.out.println(sortedNames);
        List<String> sortedNamesReverse = employees.stream().map(employee -> employee.getName().toUpperCase()).sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNamesReverse);



    }
}
