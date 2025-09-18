package Stream;

import java.time.LocalDate;

public class Employee
{

    private int id;
    private String name;
    private String department;
    private double salary;
    private String email;
    private LocalDate joiningDate;

    // Constructor
    public Employee(int id, String name, String department, double salary, String email, LocalDate joiningDate)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.joiningDate = joiningDate;
    }

    // Getters and Setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public LocalDate getJoiningDate()
    {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate)
    {
        this.joiningDate = joiningDate;
    }

    // toString method
    @Override
    public String toString()
    {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
