package Buoi12;

import java.util.Scanner;

public class Student implements IClassification {
    private String name;
    private double mark;
    private int age;
    private String classification;

    public Student() {
    }

    public Student(String name, double mark, int age, String classification) {
        this.name = name;
        this.mark = mark;
        this.age = age;
        this.classification = classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Student(String name, double mark, int age) {
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", age=" + age +
                ", classification='" + classification + '\'' +
                '}';
    }

    @Override
    public void classify() {
        if(mark>=8){
            setClassification("Giỏi");
        }
        else if(mark>=6.5){
            classification ="Khá";
        }
        else classification ="TB";
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public void inoutStudent(Scanner scanner){
        System.out.println("Input name: ");
        name= scanner.nextLine();
        System.out.println("OIOnput tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input điểm: ");
        this.mark = Double.parseDouble(scanner.nextLine());

    }
}
