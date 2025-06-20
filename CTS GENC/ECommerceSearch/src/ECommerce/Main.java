package ECommerce;

public class Main {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product("P100", "Smartphone", "Electronics"),
            new Product("P200", "Laptop", "Electronics"),
            new Product("P300", "Desk Chair", "Furniture"),
            new Product("P400", "Coffee Maker", "Appliances"),
            new Product("P500", "Bluetooth Speaker", "Electronics")
        };
        
        SearchImplementation search = new SearchImplementation(products);
        
        // Display products
        search.displayProducts();
        System.out.println();
        search.displaySortedProducts();
        System.out.println();
        
        // Test searches
        String searchId = "P300";
        String searchName = "Laptop";
        
        // Linear search by ID
        System.out.println("Linear Search by ID (" + searchId + "):");
        Product resultLinearId = search.linearSearchById(searchId);
        System.out.println(resultLinearId != null ? resultLinearId : "Product not found");
        
        // Binary search by ID
        System.out.println("\nBinary Search by ID (" + searchId + "):");
        Product resultBinaryId = search.binarySearchById(searchId);
        System.out.println(resultBinaryId != null ? resultBinaryId : "Product not found");
        
        // Linear search by name
        System.out.println("\nLinear Search by Name (" + searchName + "):");
        Product resultLinearName = search.linearSearchByName(searchName);
        System.out.println(resultLinearName != null ? resultLinearName : "Product not found");
        
        // Search for non-existent product
        String nonExistentId = "P999";
        System.out.println("\nSearch for non-existent ID (" + nonExistentId + "):");
        Product resultNotFound = search.binarySearchById(nonExistentId);
        System.out.println(resultNotFound != null ? resultNotFound : "Product not found");
    }
}