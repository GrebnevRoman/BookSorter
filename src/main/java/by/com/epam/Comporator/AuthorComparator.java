package by.com.epam.Comporator;
//
import by.com.epam.model.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getBookAuthor().compareTo(secondBook.getBookAuthor());
    }
}
