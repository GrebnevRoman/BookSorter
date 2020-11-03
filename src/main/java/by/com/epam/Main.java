package by.com.epam;
//
import by.com.epam.model.Book;
import by.com.epam.model.BookTagType;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    private final static  Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            process();
        } catch (RepositoryException e) {
            LOGGER.error(e.getMessage(),e);
        }

    }

    private static void process() throws RepositoryException {
        LOGGER.info("Start process");
        String authorForSearch = "Blinov";
        Book firstBook = new Book("Translate", "Google", 1456, 500);
        Book secondBook = new Book("Java", "Blinov", 2007, 700);
        Book thirdBook = new Book("LearnJava", "HeadFirst", 2012, 800);
        RepositoryUser repositoryUser = new RepositoryUser();
        LOGGER.info("Books adding");
        repositoryUser.addBook(firstBook);
        repositoryUser.addBook(secondBook);
        repositoryUser.addBook(thirdBook);
        LOGGER.info("Books removing");
        repositoryUser.removeBook(firstBook);
        repositoryUser.sortBook(BookTagType.PAGE);
        List<Book> searchedBooks =  repositoryUser.searchBook(BookTagType.AUTHOR,"Blinov");
    }

}
