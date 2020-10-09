package by.com.epam.Comporator;
import by.com.epam.model.Book;
import by.com.epam.model.BookTagType;

import java.util.Comparator;

public class ComparatorFactory {
    public Comparator<Book> createSpec(BookTagType param) {
        switch (param) {
            case PAGE -> {
                return new PageComparator();
            }
            case YEAR -> {
                return new YearComparator();
            }
            case TITLE -> {
                return new TitleComparator();
            }
            case AUTHOR -> {
                return new AuthorComparator();
            }
            default -> throw new IllegalArgumentException("Enter correct param" + param);
        }
    }
}
