package Lab3.entities;

public class Worker {
    private static int autoId;
    private int id;
    private int age;
    private String name;
    private double salary;

    public Worker(int age, String name, double salary) {
        this.id = ++autoId;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
