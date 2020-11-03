package by.com.epam.Specification;
//
import by.com.epam.model.Book;

public class PageSpecification extends Specification{

    @Override
    boolean specified(Book book, String value) {
        return book.getBookPages() == Integer.parseInt(value);
    }
}
