package Btt.service;

import Btt.entities.Manager;
import Btt.entities.OfficeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerService {
    public void inputEmployee(Scanner scanner , ArrayList<OfficeEmployee> employees){
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Input responsibility salary: ");
        double respSalary = Double.parseDouble(scanner.nextLine());
        employees.add(new Manager(name, salary, respSalary)) ;
    }
}
