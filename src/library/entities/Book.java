package library.entities;

public class Book {
    private static int autoId;
    private int id;
    private String name;
    private int quantity;

    public Book(String name, int quantity) {
        this.id = ++autoId;
        this.name = name;
        this.quantity = quantity;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Book.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
