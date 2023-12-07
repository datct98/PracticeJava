package BT_Sale.service;

import BT_Sale.entities.Order;
import BT_Sale.entities.OrderDetail;
import BT_Sale.entities.Person;
import BT_Sale.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderService {
    public Order orderProducts(Person person, Map<Integer,Product> products, Scanner scanner){
        List<OrderDetail> details = new ArrayList<>();
        for(Map.Entry<Integer, Product> entry: products.entrySet()){
            System.out.println("Mời b nhập số lương cho sản phẩm id: "+entry.getKey());
            int quantity = Integer.parseInt(scanner.nextLine());
            OrderDetail detail = new OrderDetail(entry.getValue(), quantity);
            details.add(detail);
        }
        Order order = new Order(details, person);
        return  order;
    }
}
