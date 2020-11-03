package by.com.epam.Specification;

import by.com.epam.model.Book;
//
public class YearSpecification extends Specification {


    @Override
    boolean specified(Book book, String value) {
        return book.getBookYear() == Integer.parseInt(value) ;
    }
}
