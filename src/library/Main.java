package library;

import library.entities.Book;
import library.entities.Person;
import library.entities.TicketBook;
import library.service.BookService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Map<Integer, Book> bookMap = Map.of(
                1, new Book("Cuốn theo chiều gió", 4),
                2,new Book("Cuốn theo chiều gió2", 4),
                3, new Book( "Cuốn theo chiều gió3", 3),
                4,new Book( "Cuốn theo chiều gió4", 2));

        Map<Integer, Person> personMap = Map.of(
                1, new Person("Tân", "HN"),
                2,new Person("Việt", "HN"),
                3, new Person( "Quý", "HN"),
                4,new Person( "Quang", "HN"));

        Map<Integer, TicketBook> ticketBookMap = new HashMap<>();

        System.out.println("Mời b nhập id sách muốn mượn: ");
        int id= Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Mời b nhập số lượng sách muốn mượn: ");
        int quantity = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Mời b nhập id bản thân: ");
        int idPerson = Integer.parseInt(new Scanner(System.in).nextLine());
        if(bookMap.containsKey(id)){
            // Ghi lại thông tin người mượn, sách đk mượn
            TicketBook ticketBook = new TicketBook(idPerson, id, new Date().toString(), "2023-11-14");
            ticketBookMap.put(ticketBook.getId(), ticketBook);
            Book book = bookService.findById(id, bookMap);
            if(book.getQuantity()>= quantity){
                book.setQuantity(book.getQuantity()- quantity);
            } else {

            }
        } else {

        }
    }
}
