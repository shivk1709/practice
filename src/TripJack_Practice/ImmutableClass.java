package TripJack_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ImmutableClass
{

    private final String name;
    private final int age;
    private final List<String> hobbies;
    private final Date joiningDate;

    public ImmutableClass(String name, int age, List<String> hobbies, Date joiningDate)
    {
        this.name = name;
        this.age = age;

        // ✅ Defensive copy for mutable List
        this.hobbies = new ArrayList<>(hobbies);

        // ✅ Defensive copy for mutable Date
        this.joiningDate = new Date(joiningDate.getTime());
    }

    // ✅ Return unmodifiable copy for List
    public List<String> getHobbies()
    {
        return Collections.unmodifiableList(new ArrayList<>(hobbies));
    }

    // ✅ Return defensive copy for Date
    public Date getJoiningDate()
    {
        return new Date(joiningDate.getTime());
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", joiningDate=" + joiningDate +
                '}';
    }

    public static void main(String[] args)
    {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Programming");
        hobbies.add("Travelling");
        hobbies.add("Badminton");

        Date date = new Date(); // current date

        ImmutableClass immutableClass = new ImmutableClass("Shiv", 26, hobbies, date);

        // Try modifying original list and date
        hobbies.add("Playing");
        date.setTime(0); // change date to epoch

        System.out.println("After modifying original inputs:");
        System.out.println(immutableClass);

        // Try modifying through getters
        immutableClass.getHobbies().add("Music"); // ❌ Throws UnsupportedOperationException
        immutableClass.getJoiningDate().setTime(9999999L); // ❌ Doesn’t affect original

        System.out.println("After trying to modify through getters:");
        System.out.println(immutableClass);
    }
}
