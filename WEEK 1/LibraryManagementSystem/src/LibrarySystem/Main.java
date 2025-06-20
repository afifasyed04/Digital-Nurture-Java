package LibrarySystem;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        // Add books to the library
        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B003", "1984", "George Orwell"));
        library.addBook(new Book("B004", "Pride and Prejudice", "Jane Austen"));
        library.addBook(new Book("B005", "The Hobbit", "J.R.R. Tolkien"));
        
        // Display all books
        library.displayBooks();
        System.out.println("\nTotal books: " + library.getBookCount());
        System.out.println();
        
        // Search tests
        String searchTitle = "1984";
        String searchAuthor = "Jane Austen";
        
        // Linear search
        System.out.println("Linear Search for '" + searchTitle + "':");
        Book linearResult = library.linearSearchByTitle(searchTitle);
        System.out.println(linearResult != null ? linearResult : "Book not found");
        System.out.println();
        
        // Binary search
        System.out.println("Binary Search for '" + searchTitle + "':");
        Book binaryResult = library.binarySearchByTitle(searchTitle);
        System.out.println(binaryResult != null ? binaryResult : "Book not found");
        System.out.println();
        
        // Author search
        System.out.println("Books by '" + searchAuthor + "':");
        List<Book> authorBooks = library.searchByAuthor(searchAuthor);
        if (authorBooks.isEmpty()) {
            System.out.println("No books found by this author");
        } else {
            for (Book book : authorBooks) {
                System.out.println(book);
            }
        }
        
        // Search for non-existent book
        String nonExistentTitle = "Moby Dick";
        System.out.println("\nSearch for '" + nonExistentTitle + "':");
        Book notFound = library.binarySearchByTitle(nonExistentTitle);
        System.out.println(notFound != null ? notFound : "Book not found");
    }
}