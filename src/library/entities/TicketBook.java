package library.entities;

public class TicketBook {
    private int id;
    private static int autoId;
    private int personId;
    private int bookId;
    private String borrowDate;
    private String returnDate;

    public int getId() {
        return id;
    }

    public TicketBook(int personId, int bookId, String borrowDate, String returnDate) {
        this.id=++autoId;
        this.personId = personId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void prinInfo(Person person){
        System.out.println("TicketBook: {Person: id: "+person.getId()+" - name: "+person.getName());
    }
}
