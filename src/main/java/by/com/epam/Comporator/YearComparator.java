package by.com.epam.Comporator;

import by.com.epam.model.Book;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return Integer.compare(firstBook.getBookYear(),secondBook.getBookYear());
    }
}
