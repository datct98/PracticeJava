package Btt.service;

import Btt.entities.Manager;
import Btt.entities.OfficeEmployee;
import Btt.entities.Sale;
import Btt.utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SaleService {
    Utils utils = new Utils();

    public void inputEmployee(Scanner scanner , ArrayList<OfficeEmployee> employees) throws ParseException {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Input sales: ");
        double sale = Double.parseDouble(scanner.nextLine());
        System.out.println("Input bonus: ");
        // xử lý exception
        double bonus=0;

        bonus = utils.inputDouble(scanner);

        employees.add(new Sale(name, salary, sale, bonus)) ;
    }
}
