package Lab3.service;

import Lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public void createWorker(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("NHập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Worker worker = new Worker(age, name, salary);
        workers.add(worker);
        //return worker;
    }

    public void updateSalary(Scanner scanner, ArrayList<Worker> workers, String operator){
        System.out.println("Mời b nhập id worker: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Worker worker: workers){
            if(worker.getId() == id){
                System.out.println("Mời b nhập lương muốn thay đổi");
                double salaryChange = Double.parseDouble(scanner.nextLine());
                double salaryNew =0 ;
                if(operator.equals("+")) salaryNew = worker.getSalary() + salaryChange;
                else salaryNew= worker.getSalary() - salaryChange;
                worker.setSalary(salaryNew);
            }
        }
    }

}
