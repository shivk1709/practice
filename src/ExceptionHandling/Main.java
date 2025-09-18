package ExceptionHandling;

import java.util.List;

public class Main
{
    private static boolean registerCourse(String studentName, int age, String courseName) throws CourseNotFoundException
    {
        List<String> courses = List.of("Biology", "Chemistry", "Physics", "Commerce", "Programming");
        if (age < 18) throw new InvalidAgeException("Age is invalid for Student " + studentName);
        if (!courses.contains(courseName)) throw new CourseNotFoundException("Invalid Course " + courseName);
        System.out.println("Bye");
        return true;
    }

    public static void main(String[] args)
    {
        try
        {
            if (registerCourse("Mahesh", 17, "Biology")) System.out.println("Registered for Course");
        } catch (CourseNotFoundException | InvalidAgeException c)
        {
            System.out.println(c.getMessage());
        }
    }
}
