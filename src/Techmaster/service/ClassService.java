package Techmaster.service;

import Techmaster.entities.ClassRoom;

import java.util.Scanner;

public class ClassService {
    public ClassRoom inputInfo(Scanner scanner){
        System.out.println("Input subject: ");
        String subject = scanner.nextLine();
        return new ClassRoom(subject);
    }
}
