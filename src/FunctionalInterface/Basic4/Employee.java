package FunctionalInterface.Basic4;

public class Employee
{
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary)
    {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName()
    {
        return name;
    }

}
