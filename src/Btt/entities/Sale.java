package Btt.entities;

public class Sale extends OfficeEmployee{
    private double sales;
    private double perBonus;

    public Sale(String name, double salary, double sales, double perBonus) {
        super(name, salary);
        this.sales = sales;
        this.perBonus = perBonus;
    }
}
