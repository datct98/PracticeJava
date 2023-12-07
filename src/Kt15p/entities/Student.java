package Kt15p.entities;

public class Student implements Comparable<Student> {
    private static int autoid;
    private int id;
    private String name;
    private String birthDate;
    private String address;

    public Student( String name) {
        this.id = ++autoid;
        this.name = name;
    }

    public Student(String name, String birthDate, String address) {
        this.id = ++autoid;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    public static int getAutoid() {
        return autoid;
    }

    public static void setAutoid(int autoid) {
        Student.autoid = autoid;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}
