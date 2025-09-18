package Optional;

import java.util.Optional;

public class Main
{
    public static void main(String[] args)
    {
        Optional<String> student = Optional.ofNullable(null);
        System.out.println(student.orElse("Name").length());
        student.ifPresent(System.out::println);
    }
}
