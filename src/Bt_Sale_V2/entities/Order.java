package Bt_Sale_V2.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private static int autoId;
    private int id;
    private LocalDate orderDate;
    private int personId;

    public Order( int personId) {
        this.id = ++autoId;
        this.orderDate = LocalDate.now();
        this.personId = personId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Order.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
