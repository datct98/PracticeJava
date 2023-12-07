package Bt_Sale_V2.service;

import Bt_Sale_V2.entities.Order;
import Bt_Sale_V2.entities.OrderDetail;
import Bt_Sale_V2.entities.Person;
import Bt_Sale_V2.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderService {
    public Order orderProducts(Person person, Map<Integer, Product> products, Scanner scanner){
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
