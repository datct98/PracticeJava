package login;

import login.entities.User;
import login.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User("dat","123"),
                new User("quy","321")));
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        userService.login(scanner, users);
    }
}
