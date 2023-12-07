package Buoi12;

import java.util.Scanner;

public class StudentService {
    public Student createStudent(Scanner scanner){
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("OIOnput tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input điểm: ");
        double marks = Double.parseDouble(scanner.nextLine());
        return new Student(name, marks, age);
    }
}
