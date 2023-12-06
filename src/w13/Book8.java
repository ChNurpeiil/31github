package w13;

import java.util.Objects;

public class Book8 {
    private static int lastId =0;
    private int id;
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book8(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book8)) return false;
        Book8 other = (Book8) o;
        return this.title.equalsIgnoreCase(other.title)&&
                this.author.equalsIgnoreCase(other.author)&&
                this.genre.equalsIgnoreCase(other.genre)&&
                this.year == other.year;
      }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase(), year , genre.toLowerCase());
    }

    public static void main(String[] args) {
        Book8 book1 = new Book8("To Kill a Mockingbird", "Harper Lee", 1960, "Classic Fiction");
        Book8 book2 = new Book8("to kill a mockingbird", "harper lee", 1960, "classic fiction");
        Book8 book3 = new Book8("1984", "George Orwell", 1949, "Dystopian Fiction");


        System.out.println("Comparing book1 and book2: " + book1.equals(book2));
        System.out.println("Comparing book1 and book3: " + book1.equals(book3));
        System.out.println("Hash code of book1: " + book1.hashCode());
        System.out.println("Hash code of book2: " + book2.hashCode());
        System.out.println("Hash code of book3: " + book3.hashCode());
    }

}
