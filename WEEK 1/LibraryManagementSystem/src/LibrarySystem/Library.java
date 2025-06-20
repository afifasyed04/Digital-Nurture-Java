package LibrarySystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> sortedBooks; // Maintain a sorted version for binary search
    
    public Library() {
        books = new ArrayList<>();
        sortedBooks = new ArrayList<>();
    }
    
    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        sortedBooks.add(book);
        Collections.sort(sortedBooks);
    }
    
    // Linear search by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    // Binary search by title (requires sorted list)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = sortedBooks.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedBooks.get(mid).getTitle().compareToIgnoreCase(title);
            
            if (comparison == 0) {
                return sortedBooks.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    
    // Linear search by author
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    
    // Display all books
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    // Get book count
    public int getBookCount() {
        return books.size();
    }
}