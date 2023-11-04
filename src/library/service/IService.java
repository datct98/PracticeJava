package library.service;

import library.entities.Book;

import java.util.Map;
import java.util.Scanner;

public interface IService<T> {
    void insert(Scanner scanner, Map<Integer, T> t);
    void update(Scanner scanner, Map<Integer, T> t);
    void delete(Scanner scanner, Map<Integer, T> t);
}
