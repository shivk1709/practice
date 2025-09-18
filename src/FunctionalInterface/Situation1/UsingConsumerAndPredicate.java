package FunctionalInterface.Situation1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingConsumerAndPredicate
{
    public static void main(String[] args)
    {
        // Create a list of students
        List<Student> students = new ArrayList<>();

        // Add students to the list
        students.add(new Student(1, "Alice", "Smith", 85.5));
        students.add(new Student(2, "Bob", "Johnson", 78.0));
        students.add(new Student(3, "Charlie", "Williams", 92.3));
        students.add(new Student(4, "Diana", "Brown", 67.8));
        students.add(new Student(5, "Ethan", "Davis", 74.6));

        Predicate<Student> greaterThan75 = student -> student.getMarks() >= 75;

        Consumer<Student> printNames = student -> System.out.println(student.getFirstName());

        students.stream().filter(greaterThan75).forEach(printNames);
    }
}
