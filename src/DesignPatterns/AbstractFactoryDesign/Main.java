package DesignPatterns.AbstractFactoryDesign;

public class Main {

    public static void main(String[] args) {
        Employee employee = FactoryClass.getEmployee(new JavaFactory());
        System.out.println(employee.name());
        System.out.println(employee.salary());
    }
}
