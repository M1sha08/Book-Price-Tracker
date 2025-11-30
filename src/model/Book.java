package model;

import java.util.Objects;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final String publisher;

    public Book(String isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public String toString() {
        return String.format("%s by %s (ISBN: %s)", title, author, isbn );
    }

}
