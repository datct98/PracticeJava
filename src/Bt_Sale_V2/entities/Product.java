package Bt_Sale_V2.entities;

public class Product {
    private static int autoId;
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.id = ++autoId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
