package login.service;

import login.entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserService {
    public void login(Scanner scanner, ArrayList<User> users){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        // Gán dữ liệu từ hàm vào đối tượng user
        User user = findByUsernameAndPassword(username, password, users);
        if(user == null) System.out.println("Login thất bại");
        else System.out.println("Login thành công");
    }

    private User findByUsernameAndPassword(String username, String password, ArrayList<User> users){
        for (User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    Map<String, User> map = new HashMap<>();
    private User findByEmail(String email, Map<String, User> map){
        return map.get(email);

    }
}
