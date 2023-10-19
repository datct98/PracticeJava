package Techmaster;

import Techmaster.entities.ClassRoom;
import Techmaster.entities.Student;
import Techmaster.entities.Techmaster;
import Techmaster.service.ClassService;
import Techmaster.service.StudentService;
import Techmaster.service.TechmasterService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        TechmasterService techmasterService = new TechmasterService();
        ClassService classService = new ClassService();
        StudentService studentService = new StudentService();
        Techmaster techmaster = techmasterService.inputInfo(scanner);
        System.out.println("Nhập thông tin cho class của techmaster");
        ClassRoom classRoom = classService.inputInfo(scanner);
        System.out.println("Nhập số hs có trong lớp học: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            studentService.inputStudent(scanner, students);
        }
        classRoom.setStudents(students);
        techmaster.setClassRoom(classRoom);
        System.out.println(techmaster);
    }
}
