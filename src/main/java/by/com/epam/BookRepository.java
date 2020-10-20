package by.com.epam;

import by.com.epam.model.Book;
import by.com.epam.model.BookTagType;

import java.util.List;
//interface to create books
public interface BookRepository {
    void addBook(Book book);

    void removeBook(Book book) throws RepositoryException;

    List<Book> searchBook(BookTagType param, String value) throws RepositoryException;

    void sortBook(BookTagType tagType);

}

