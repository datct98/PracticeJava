package BT_Sale.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private static int autoId;
    private int id;
    private List<OrderDetail> orderDetails;
    private LocalDate orderDate;
    private Person person;

    public Order(List<OrderDetail> orderDetails, Person person) {
        this.id = ++autoId;
        this.orderDetails = orderDetails;
        this.orderDate = LocalDate.now();
        this.person = person;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDetails=" + orderDetails +
                ", orderDate=" + orderDate +
                ", person=" + person +
                '}';
    }
}
