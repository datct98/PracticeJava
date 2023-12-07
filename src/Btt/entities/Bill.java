package Btt.entities;

public class Bill {
    private long oldNumber;
    private long newNumber;
    private double price;
    private Customer family;

    public Bill(long oldNumber, long newNumber, double price, Customer family) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.price = price;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Bill{" +
                ", oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", price=" + price +
                ", family=" + family +
                '}';
    }
}
