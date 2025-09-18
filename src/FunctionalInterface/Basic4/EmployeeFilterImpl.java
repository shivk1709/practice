package FunctionalInterface.Basic4;

import java.util.Comparator;
import java.util.List;

public class EmployeeFilterImpl
{
    public List<Employee> getFilteredEmployee(List<Employee> employees, EmployeeFilter employeeFilter)
    {
        return employees.stream().filter(employeeFilter::checkEmployee).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
    }


}
