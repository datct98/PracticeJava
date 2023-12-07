package Btt.entities;

public class OfficeEmployee {
    private static int autoId;
    private int id;
    private String name;
    private double salary;

    public OfficeEmployee() {
    }

    public OfficeEmployee(String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }
}
