package w13;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }

}
class EBook extends Book{
    String format;

    public EBook(String title, String author, double price, String format) {
        super(title, author, price);
        this.format = format;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Format: "+ format);
    }

    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
        EBook eBook = new EBook("Pride and Prejudice", "Jane Austen", 9.99, "PDF");

        System.out.println("Details of the Book:");
        book.displayDetails();

        System.out.println("\nDetails of the EBook:");
        eBook.displayDetails();

    }
}
