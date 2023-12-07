package BT_Sale.entities;

public class OrderDetail {
    private static int autoId;
    private int id;
    private Product product;
    private int quantity;

    public OrderDetail(Product product, int quantity) {
        this.id = ++autoId;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
