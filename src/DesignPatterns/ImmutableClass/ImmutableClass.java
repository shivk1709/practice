package DesignPatterns.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutableClass(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
//        this.hobbies = List.copyOf(hobbies); //this will make list immutable
        this.hobbies = hobbies; //this will make list mutable

    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Programming");
        hobbies.add("Travelling");
        hobbies.add("Badminton");
        ImmutableClass immutableClass = new ImmutableClass("Shiv", 26, hobbies);
        hobbies.add("Playing");

        System.out.println(immutableClass.getHobbies());
    }
}
