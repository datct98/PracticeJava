package library.entities;

public class Person {

    private static int autoId;
    private int id;
    private String name;
    private String phone;
    private String address;


    public Person(String name, String phone, String address) {
        this.id = ++autoId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Person(String name, String address) {
        this.id = ++autoId;
        this.name = name;
        this.address = address;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Person.autoId = autoId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
