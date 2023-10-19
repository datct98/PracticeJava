package Techmaster.service;

import Techmaster.entities.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public void inputStudent(Scanner scanner, ArrayList<Student> students){
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input học lực: ");
        String classify = scanner.nextLine();
        Student student = new Student(name, age, classify);
        students.add(student);
    }
}
