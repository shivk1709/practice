package Stream;

import java.util.*;
import java.util.stream.*;

public class Question2Solution
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Anna");
        List<String> ans1 = names.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println(ans1);

        Optional<String> ans2 = names.stream().reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        ans2.ifPresent(System.out::println);

        List<Person> persons = Arrays.asList(new Person("Mahesh", 10, 20000),
                new Person("Suresh", 20, 40000),
                new Person("Jitesh", 41, 50000),
                new Person("Naresh", 50, 90000),
                new Person("Nitin", 55, 90000),
                new Person("Saitraj", 50, 90000),
                new Person("Bhavtesh", 20, 2000000),
                new Person("Bhuvnesh", 10, 100000));

        Map<Integer, List<String>> ans3 = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(ans3);

        Map<Integer, List<Person>> ans31 = persons.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(ans31);

        Map<Boolean, List<String>> ans4 = persons.stream().collect(Collectors.partitioningBy(person -> person.getAge() % 2 == 0, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(ans4);

        Map<Boolean, List<Person>> ans41 = persons.stream().collect(Collectors.partitioningBy(person -> person.getAge() % 2 == 0));
        System.out.println(ans41);

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> ans5 = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(ans5);

        List<String> ans6 = words.stream().map(String::toUpperCase).toList();
        System.out.println(ans6);

        List<Integer> integers = Arrays.asList(2, 4, 3, 5, 1, 0, 4, 7);
        Optional<Integer> ans7 = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        ans7.ifPresent(System.out::println);

        Map<Character, List<String>> ans9 = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
        Map<Character, List<String>> ans91 = persons
                .stream()
                .collect(Collectors.groupingBy(person -> person.getName()
                        .charAt(0), Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(ans9);
        System.out.println(ans91);
    }
}
