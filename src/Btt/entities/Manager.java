package Btt.entities;

public class Manager extends OfficeEmployee{
    private double respSalary;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager(String name, double salary, double respSalary) {
        super(name, salary);
        this.respSalary = respSalary;
    }
}
