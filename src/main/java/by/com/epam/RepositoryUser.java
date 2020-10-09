package by.com.epam;

import by.com.epam.model.Book;
import by.com.epam.model.BookTagType;
import by.com.epam.Comporator.*;
import by.com.epam.Specification.*;

import java.util.*;

public class RepositoryUser implements BookRepository {
    private final List<Book> books;

    public RepositoryUser() {
        books = new ArrayList<Book>();
    }

    @Override
    public void addBook(Book book) {
     books.add(book);
    }

    @Override
    public void removeBook(Book book) throws RepositoryException {
        boolean result = books.remove(book);
        if(!result){
            throw new RepositoryException("Book does not exist");
        }
    }

    @Override
    public List<Book> searchBook(BookTagType tagType, String value) throws RepositoryException {
        SpecificationFactory factory = new SpecificationFactory();
        Specification specification = factory.createSpec(tagType);
        return specification.find(books,value);
    }

    @Override
    public void sortBook(BookTagType tagType) {
        ComparatorFactory factory = new ComparatorFactory();
        Comparator comparator = factory.createSpec(tagType);
        books.sort(comparator);
    }
}
