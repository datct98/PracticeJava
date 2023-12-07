package Bt_Sale_V2.entities;

public class OrderDetail {
    private static int autoId;
    private int id;
    private int productId;
    private int quantity;
    private int orderId;

    public OrderDetail(int productId, int quantity, int orderId) {
        this.id = ++autoId;
        this.productId = productId;
        this.quantity = quantity;
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", product=" + productId +
                ", quantity=" + quantity +
                '}';
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        OrderDetail.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
