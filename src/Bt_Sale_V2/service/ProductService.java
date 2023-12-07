package Bt_Sale_V2.service;

import Bt_Sale_V2.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    public Map<Integer, Product> addToCart(Map<Integer, Product> productsInStock, Scanner scanner){
        Map<Integer, Product> productsCart = new HashMap<>();

        do {
            System.out.println("Mời b nhập id sp muốn thêm vào giỏ hàng: ");
            int id = Integer.parseInt(scanner.nextLine());
            productsCart.put(id, productsInStock.get(id));
            System.out.println("D y want to continue?");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("n"))
                return productsCart;
        } while (true);
    }
}
