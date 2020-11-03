package by.com.epam.Specification;
//
import by.com.epam.model.Book;

public class TitleSpecification extends Specification {
    @Override
    boolean specified(Book book, String value) {
        return book.getBookTitle().equals(value);
    }
}
