package library.service;

import library.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookService implements IService<Book>{

    @Override
    public void insert(Scanner scanner, Map<Integer, Book> bookMap) {

    }

    @Override
    public void update(Scanner scanner, Map<Integer, Book> bookMap) {

    }

    @Override
    public void delete(Scanner scanner, Map<Integer, Book> bookMap) {

    }

    public Book findById(int id, Map<Integer, Book> bookMap){
        return bookMap.get(id);
    }

   public void findByName(String name, Map<Integer, Book> bookMap){
       for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            if(entry.getValue().getName().equals(name)){

           } else {

            }

       }

   }


}
