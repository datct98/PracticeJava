package Buoi12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1- Login");
        System.out.println("2- Register");
        do {
            System.out.println("Moeif b lựa chọn");
            Scanner scanner = new Scanner(System.in);
            try{
                int n = scanner.nextInt();
                System.out.println(n);
                break;
            } catch (Exception e){
                System.out.println("Lỗi: "+ e.getMessage());
                System.out.println();
            }
        } while (true);

    }
}
