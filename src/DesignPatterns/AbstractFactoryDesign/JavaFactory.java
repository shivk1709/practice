package DesignPatterns.AbstractFactoryDesign;

public class JavaFactory extends EmployeeAbstractClass{
    @Override
    public Employee getEmployee() {
        return new JavaDev();
    }
}
