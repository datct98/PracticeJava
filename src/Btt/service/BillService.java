package Btt.service;

import Btt.entities.Bill;
import Btt.entities.Customer;
import Btt.utils.Utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    CustomerService customerService = new CustomerService();
    Utils utils = new Utils();

    public void inputBill(Scanner scanner, ArrayList<Bill> bills, ArrayList<Customer> customers){
        System.out.println("Mời b nhập chỉ số cũ: ");
        long oldNumber = utils.inputLong(scanner);
        System.out.println("Mời b nhập chỉ số mới: ");
        long newNumber = utils.inputLong(scanner);
        System.out.println("Mời b nhập số tiền phải trả");
        double price = 0;
        try {
            price = utils.inputDouble(scanner);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Mời b nhâp tt của hộ sử dụng điện: ");

        Customer customer = customerService.inputCustomer(scanner, customers);
        Bill bill = new Bill(oldNumber, newNumber, price, customer);
        bills.add(bill);
    }

    public void prinInfo(){
        customerService.printInfo();
    }
}
