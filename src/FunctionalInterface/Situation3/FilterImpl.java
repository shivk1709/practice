package FunctionalInterface.Situation3;

import java.util.Arrays;
import java.util.List;

public class FilterImpl
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("John", "", null, "Alice", "  ", "Bob");

        Filter<String> filter = string -> string != null && !string.isEmpty();

        names.stream().filter(filter::filter).forEach(System.out::println);

    }
}
