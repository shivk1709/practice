package DesignPatterns.FactoryDesign;

public class FactoryClass {

    public static Employee getSalaryByDeptmnt(String department) {
        System.out.println("Calling Factory Method");
        switch (department) {
            case "Android Developer":
                return new AndroidDev();
            case "Java Developer":
                return new JavaDev();
            default:
                throw new RuntimeException("Wrong Department");
        }

    }

}
