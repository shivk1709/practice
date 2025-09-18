package DesignPatterns.FactoryDesign;

import java.util.Scanner;

public class JavaDev extends Employee {

    public int salary()
    {
        System.out.println("Calling Java Dev");
        return 40000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Type");
        String input = scanner.nextLine();
        Employee employee = FactoryClass.getSalaryByDeptmnt(input);
        System.out.println(employee.salary());
    }

}
