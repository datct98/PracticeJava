package Btt.service;

import Btt.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public Customer inputCustomer(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("Mời b nhập Họ tên chủ nhà: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập số nhà: ");
        String address = scanner.nextLine();
        System.out.println("Mời b nhập mã công tơ: ");
        String code = scanner.nextLine();
        Customer customer = new Customer(name, address, code);
        customers.add(customer);
        return customer;
    }

    public void printInfo(){
        System.out.println(".......");
    }
}
