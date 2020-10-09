package by.com.epam.Comporator;

import by.com.epam.model.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getBookTitle().compareTo(secondBook.getBookTitle());
    }
}
