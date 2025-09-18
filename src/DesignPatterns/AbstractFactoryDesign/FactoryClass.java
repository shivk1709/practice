package DesignPatterns.AbstractFactoryDesign;

public class FactoryClass{

    public static Employee getEmployee(EmployeeAbstractClass employeeAbstractClass)
    {
        return employeeAbstractClass.getEmployee();
    }

}
