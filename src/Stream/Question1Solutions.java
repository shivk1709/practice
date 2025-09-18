package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Question1Solutions
{
    public static void main(String[] args)
    {
        List<String> fruits = Arrays.asList("Banana", "Papaya", "Apple", "orange", "Ore", "Kiwi", "Mango", "Ape");
        // From a list of strings, return only those that start with a vowel and have more than 3 characters.
        List<String> answer1 = fruits
                .stream()
                .filter(fruit -> fruit.length() > 3)
                .filter(fruit -> fruit.toUpperCase().startsWith("A") || fruit.toUpperCase().startsWith("E") || fruit.toUpperCase().startsWith("I") || fruit.toUpperCase().startsWith("O") || fruit.toUpperCase().startsWith("U"))
                .toList();
        System.out.println(answer1);

        //        Given a list of integers, return a list of their squares, but only include even numbers.
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 9, 9, 4, 6, 0, 0, 4, 8, 2, 6, 2, 8, 5, 7);
        List<Integer> answer2 = integers.stream().filter(num -> num % 2 == 0).map(num -> num * num).toList();
        System.out.println(answer2);

        List<Person> persons = Arrays.asList(new Person("Mahesh", 30, 20000),
                new Person("Suresh", 20, 40000),
                new Person("Jitesh", 40, 50000),
                new Person("Naresh", 50, 90000),
                new Person("Nitin", 50, 90000),
                new Person("Saitraj", 50, 90000),
                new Person("Bhavtesh", 45, 2000000),
                new Person("Bhuvnesh", 10, 100000));



        List<String> ans3 = persons.stream().filter(person -> person.getAge() > 30).map(Person::getName).toList();
        List<Person> ans31 = persons.stream().filter(person -> person.getAge() > 30).toList();
        System.out.println(ans31);
        System.out.println(ans3);

        Optional<Person> answer5 = persons.stream().max(Comparator.comparingInt(Person::getSalary));
        answer5.ifPresent(System.out::println);

        Collections.sort(persons, Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        System.out.println(persons);

        List<Person> sortedPersons = persons.stream().sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName)).toList();
        System.out.println(sortedPersons);

        List<List<Integer>> integerList = Arrays.asList(Arrays.asList(2, 4, 6), Arrays.asList(1, 3, 5));
        integerList.stream().flatMap(List::stream).sorted().forEach(System.out::println);

        Map<Character, List<String>> answer4 = persons.stream().collect(Collectors.groupingBy(person -> person.getName().charAt(0), Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(answer4);

        List<String> words = Arrays.asList("Shiv", "Mahak", "Shiv", "Mahi", "Mahak", "Mansi", "Manya");
        Map<String, Long> answer8 = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(answer8);

        Map<Character, List<String>> ans34 = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(ans34);

        Optional<String> answer10 = words.stream().reduce((a, b) -> a + ", " + b);
        answer10.ifPresent(System.out::println);
    }


}
