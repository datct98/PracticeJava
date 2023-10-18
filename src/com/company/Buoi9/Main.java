package com.company.Buoi9;


import com.company.Buoi9.entities.Student;
import com.company.Buoi9.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        studentService.createStudentList(scanner, students);

        System.out.println(students);
        studentService.percentTypeStudent(students);
    }
}
