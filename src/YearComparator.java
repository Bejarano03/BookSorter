import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        // Sort by year in descending order (newest first)
        return Integer.compare(book2.getYear(), book1.getYear());
    }
}