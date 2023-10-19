package Techmaster.service;

import Techmaster.entities.Techmaster;

import java.util.Scanner;

public class TechmasterService {
    public Techmaster inputInfo(Scanner scanner){
        System.out.println("input teacher: ");
        String teacher = scanner.nextLine();
        System.out.println("input manager: ");
        String manager = scanner.nextLine();
        return new Techmaster(manager, teacher);
    }
}
