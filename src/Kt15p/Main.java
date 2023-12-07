package Kt15p;

import Kt15p.entities.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("dat"));
        map.put(2, new Student("dat3"));
        map.put(4, new Student("dat2"));
        Set<Integer> keys = map.keySet();
        int id=3;


        System.out.println(map);
    }
}
