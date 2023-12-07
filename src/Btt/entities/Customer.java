package Btt.entities;

public class Customer {
    private String nameOwner;
    private String address;
    private String codeElectr;
    private String username;
    private String password;
    private String role;

    public String getRole() {
        return role;
    }

    public Customer(String nameOwner, String address, String codeElectr) {
        this.nameOwner = nameOwner;
        this.address = address;
        this.codeElectr = codeElectr;
    }
}
