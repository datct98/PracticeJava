package Bt_Sale_V2;

import BT_Sale.entities.Person;
import BT_Sale.entities.Product;
import Bt_Sale_V2.entities.Order;
import Bt_Sale_V2.entities.OrderDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(new Person("dat", 10000),
                new Person("Hoàng", 10000),
                new Person("Quý", 10000)));

        Map<Integer, Product> products = new HashMap<>();
        Product p1 = new Product("Mỳ tôm", 4, 5000);
        Product p2 = new Product("Thanh long", 5, 5000);
        Product p3 = new Product("Mỳ tôm thanh long", 6, 5000);
        Product p4 = new Product("Mỳ thanh ong tôm", 4, 5000);
        products.put(p1.getId(), p1);
        products.put(p2.getId(), p2);
        products.put(p3.getId(), p3);
        products.put(p4.getId(), p4);

        Map<Integer, Order> orderMap = new HashMap<>();
        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        orderMap.put(o1.getId(), o1);
        orderMap.put(o2.getId(), o2);
        orderMap.put(o3.getId(), o3);

        OrderDetail orderDetail = new OrderDetail(1, 4, 1);
        OrderDetail orderDetail2 = new OrderDetail(1, 4, 1);
        OrderDetail orderDetail3 = new OrderDetail(1, 4, 2);
        OrderDetail orderDetail4 = new OrderDetail(1, 4, 1);

        List<OrderDetail> orderDetails = new ArrayList<>(Arrays.asList(orderDetail,orderDetail2,orderDetail3,orderDetail4));

    }
}
