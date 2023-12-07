package BT_Sale;

import BT_Sale.entities.Person;
import BT_Sale.entities.Product;
import BT_Sale.service.OrderService;
import BT_Sale.service.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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

        ProductService productService = new ProductService();
        Map<Integer, Product> productsInCart = productService.addToCart(products, new Scanner(System.in));

        OrderService service = new OrderService();
        System.out.println(service.orderProducts(people.get(0), productsInCart, new Scanner(System.in)));
    }
}
