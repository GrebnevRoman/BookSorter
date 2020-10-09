package by.com.epam.Specification;

import by.com.epam.model.Book;

public class AuthorSpecification extends Specification {
    @Override
    boolean specified(Book book, String value) {
        return book.getBookAuthor().equals(value);
    }
}
