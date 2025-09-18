package FunctionalInterface.Situation1;

public class Student
{
    private int id;
    private String firstName;
    private String LastName;
    private Double marks;

    public Student(int id, String firstName, String lastName, Double marks)
    {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.marks = marks;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String lastName)
    {
        LastName = lastName;
    }

    public Double getMarks()
    {
        return marks;
    }

    public void setMarks(Double marks)
    {
        this.marks = marks;
    }
}
