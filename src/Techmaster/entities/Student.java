package Techmaster.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private int age;
    private String classify;

    public Student(String name, int age, String classify) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.classify = classify;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Student.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classify='" + classify + '\'' +
                '}';
    }
}
