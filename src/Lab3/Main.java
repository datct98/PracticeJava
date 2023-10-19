package Lab3;

import Lab3.entities.Worker;
import Lab3.service.WorkerService;
import Lab3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<Worker> workers = new ArrayList<>();
        WorkerService service = new WorkerService();
        menu.displayMenu(scanner, workers, service);

    }
}
