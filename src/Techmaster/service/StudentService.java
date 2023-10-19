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

    public void updateHL14(Scanner scanner, ArrayList<Student> students){
        System.out.println("nhập id học sinh muốn update: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students){
            if(student.getId() == id){
                System.out.println("Nhập học lực muốn thay đổi: ");
                String classify = scanner.nextLine();
                student.setClassify(classify);
                break;
            }
        }
    }

    public void deletStudent(Scanner scanner, ArrayList<Student>students){
        System.out.println("nhập id học sinh muốn update: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student: students){
            if(student.getId() == id){
                students.remove(student);
                break;
            }
        }
    }
}
