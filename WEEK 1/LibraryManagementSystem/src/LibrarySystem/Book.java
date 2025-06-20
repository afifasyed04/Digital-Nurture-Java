package LibrarySystem;

public class Book implements Comparable<Book> {
    private String bookId;
    private String title;
    private String author;
    
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    
    // Getters
    public String getBookId() {
        return bookId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
    
    @Override
    public String toString() {
        return String.format("Book [ID=%s, Title=%s, Author=%s]", 
                           bookId, title, author);
    }
}