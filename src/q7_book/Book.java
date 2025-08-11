package q7_book;
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + " | Author: " + author + " | Year of publication: " + year);
    }

    public boolean isSameBook(Book other) {
        return this.title.equalsIgnoreCase(other.title) &&
               this.author.equalsIgnoreCase(other.author) &&
               this.year == other.year;
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 1988);
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 1988);
        Book b3 = new Book("Inferno", "Dan Brown", 2013);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();

        System.out.println("b1 and b2 are same? " + b1.isSameBook(b2));
        System.out.println("b1 and b3 are same? " + b1.isSameBook(b3));
    }
}