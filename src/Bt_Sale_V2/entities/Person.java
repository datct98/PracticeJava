package Bt_Sale_V2.entities;

public class Person {
    private static int autoId;
    private int id;
    private String name;
    private int role; // 1: Saler, 2: Customer
    private double amount;

    public Person( String name, double amount) {
        this.id = ++autoId;
        this.name = name;
        this.role = 2;
        this.amount = amount;
    }

    public static int getAutoId() {
        return autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRole() {
        return role;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", amount=" + amount +
                '}';
    }
}
