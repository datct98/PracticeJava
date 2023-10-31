package Kt15p.service;

import Kt15p.entities.Classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolService {
    public void findByClassname(Scanner scanner, ArrayList<Classroom> classrooms){
        System.out.println("Nhập lớp học muốn tìm: ");
        String className = scanner.nextLine();
        for (Classroom classroom: classrooms){
            if(classroom.getName().equalsIgnoreCase(className))
                System.out.println(classroom.getStudents());
        }
    }
}
