package Kt15p.service;

import Kt15p.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public void inputStudent(ArrayList<Student> students, Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập ngày tháng năm sinh: ");
        String birthDate = scanner.nextLine();
        System.out.println("Mời b nhập địa chỉ: ");
        String address = scanner.nextLine();
        students.add(new Student(name, birthDate, address));
    }

    public void findAllStudentByAddressAndBirthDate(Scanner scanner, ArrayList<Student> students){
        System.out.println("Nhập địa chỉ muốn tìm: ");
        String address = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        String year = scanner.nextLine();

        for (Student student: students){
            if(student.getAddress().equalsIgnoreCase(address) &&
            student.getBirthDate().contains(year)){
                System.out.println(student);
            }
        }
    }
}
