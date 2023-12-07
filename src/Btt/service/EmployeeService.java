package Btt.service;

import Btt.entities.OfficeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    public void inputEmployee(Scanner scanner , ArrayList<OfficeEmployee> employees){
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        employees.add(new OfficeEmployee(name, salary)) ;
    }

}
