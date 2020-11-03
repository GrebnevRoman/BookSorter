package by.com.epam.model;

import java.util.Objects;
//
public class Book {
    private final String bookTitle;
    private final int bookYear;
    private final int bookPages;
    private final String bookAuthor;

    public Book(String bookTitle, String bookAuthor, int bookYear, int bookPages) {
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookTitle = bookTitle;
        this.bookYear = bookYear;
    }

    public int getBookPages() { return bookPages; }

    public int getBookYear() {
        return bookYear;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() { return bookTitle; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear &&
                bookPages == book.bookPages &&
                Objects.equals(bookTitle, book.bookTitle) &&
                Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookYear, bookPages, bookAuthor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookYear=" + bookYear +
                ", bookPages=" + bookPages +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}

