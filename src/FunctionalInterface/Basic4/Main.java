package FunctionalInterface.Basic4;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Employee> allEmp = Arrays.asList(new Employee("Mahesh", "Education", 2000), new Employee("Suresh", "IT", 50000), new Employee("Kamlesh", "Banking", 70000), new Employee("Ritu", "Clerk", 8000), new Employee("Rajan", "Health", 60000));
        EmployeeFilterImpl employeeFilter = new EmployeeFilterImpl();
        var filteredEmp = employeeFilter.getFilteredEmployee(allEmp, e -> e.getSalary() > 10000);
        filteredEmp.forEach(System.out::println);
        filteredEmp = employeeFilter.getFilteredEmployee(allEmp, employee -> employee.getName().startsWith("R"));
        filteredEmp.forEach(System.out::println);
    }
}
