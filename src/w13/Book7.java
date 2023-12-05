package w13;

public class Book7 {
    String title;
    String author;
    int year;
    String genre;

    public Book7(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
    public String toString(){
        return "Title: "+ title+"\nAuthor: "+ author+"\nPublication Year: "+ year+ "\nGenre: "+ genre;
    }

    public static void main(String[] args) {
        Book7 book = new Book7("Сынган кылыч", "Туголбай Касымбеков", 1997,"тарыхый роман");
        System.out.println(book.toString());
    }
}
