package Lab3.view;

import Lab3.entities.Worker;
import Lab3.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu(Scanner scanner, ArrayList<Worker> workers, WorkerService service){
        String chooseContinue ="";
        do {
            System.out.println("====== Worker Management ======");
            System.out.println("1- CReate worker");
            System.out.println("2- Up salary");
            System.out.println("3- Down salary");
            System.out.println("4- Display worker list");
            System.out.println("Please choose: ");

            menuSelect(scanner, workers, service);
            System.out.println("DO y want to continue?(Y/N)");
            chooseContinue = scanner.nextLine();
        }while (chooseContinue.equalsIgnoreCase("y"));
    }

    public void menuSelect(Scanner scanner, ArrayList<Worker> workers, WorkerService service){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                service.createWorker(scanner, workers);
                break;
            case 2:
                service.updateSalary(scanner, workers, "+");
                break;
            case 3:
                service.updateSalary(scanner, workers, "-");
                break;
            case 4:
                System.out.println(workers);
                break;
            default:
                System.out.println("Ngu vãi");
        }
    }
}
