package by.com.epam.Specification;

import by.com.epam.RepositoryException;
import by.com.epam.model.Book;
//
import java.util.ArrayList;
import java.util.List;

public abstract class Specification  {

    abstract boolean specified(Book book, String value);

    public List<Book> find(List<Book> books, String value) throws RepositoryException {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (specified(book, value)) {
                result.add(book);
            }
        }
        if (result.size() > 0) {
            return result;
        } else throw new RepositoryException("Book does not exist");
    }
}


