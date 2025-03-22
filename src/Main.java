import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Animal Farm", "George Orwell", 1945));

        // Default Sorting by Title
        System.out.println("Default Sorting by Title:");
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        // Sorting by Author
        System.out.println("Sorting by Author:");
        Collections.sort(books, new AuthorComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        // Sorting by Year (Newest First)
        System.out.println("Sorting by Year (Newest First):");
        Collections.sort(books, new YearComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        // Chained Sorting: Author then Title
        System.out.println("Chained Sorting: Author then Title:");
        Collections.sort(books, new AuthorThenTitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}