package TripJack_Practice;

public class Person_Builder
{
    // Required fields
    private final String firstName;
    private final String lastName;

    // Optional fields
    private final int age;
    private final String phone;
    private final String address;

    // Private constructor, only Builder can create Person_Builder
    private Person_Builder(PersonBuilder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Static nested Builder class
    public static class PersonBuilder
    {
        // Required fields
        private final String firstName;
        private final String lastName;

        // Optional fields with default values
        private int age = 0;
        private String phone = "";
        private String address = "";

        // Constructor for required fields
        public PersonBuilder(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter methods for optional fields return Builder
        public PersonBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public PersonBuilder phone(String phone)
        {
            this.phone = phone;
            return this;
        }

        public PersonBuilder address(String address)
        {
            this.address = address;
            return this;
        }

        // Build method to create Person_Builder object
        public Person_Builder build()
        {
            return new Person_Builder(this);
        }
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + ", Age: " + age + ", Phone: " + phone + ", Address: " + address;
    }

    // Demo main method
    public static void main(String[] args)
    {
        Person_Builder person = new Person_Builder.PersonBuilder("Alice", "Smith")
                .age(28)
                .phone("987-654-3210")
                .address("456 Park Avenue")
                .build();

        System.out.println(person);

        // Person with only required fields
        Person_Builder person2 = new Person_Builder.PersonBuilder("Bob", "Johnson").build();
        System.out.println(person2);
    }
}
