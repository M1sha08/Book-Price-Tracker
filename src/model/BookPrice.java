package model;

import java.time.LocalDateTime;

public class BookPrice {
    private final Book book;
    private final String store;
    private final double priceAmount;
    private final String currency;
    private final LocalDateTime scrapedAt;

    public BookPrice(Book book, String store, double priceAmount, String currency) {
        this.book = book;
        this.store = store;
        this.priceAmount = priceAmount;
        this.currency = currency;
        this.scrapedAt = LocalDateTime.now();
    }

    public Book getBook() { return book; }
    public String getStore() { return store; }
    public double getPriceAmount() { return priceAmount; }
    public String getCurrency() { return currency; }
    public LocalDateTime getScrapedAt() { return scrapedAt; }

    @Override
    public String toString() {
        return String.format("%s: %.2f %s (scraped: %s)",
                store, priceAmount, currency, scrapedAt);
    }

}
