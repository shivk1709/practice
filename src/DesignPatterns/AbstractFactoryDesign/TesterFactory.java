package DesignPatterns.AbstractFactoryDesign;

public class TesterFactory extends EmployeeAbstractClass{
    @Override
    public Employee getEmployee() {
        return new Tester();
    }
}
