package ECommerce;

import java.util.Arrays;

public class SearchImplementation {
    private Product[] productsArray; // For linear search
    private Product[] sortedProductsArray; // For binary search
    
    public SearchImplementation(Product[] products) {
        this.productsArray = Arrays.copyOf(products, products.length);
        this.sortedProductsArray = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProductsArray); // Sort for binary search
    }
    
    // Linear search by product ID
    public Product linearSearchById(String productId) {
        for (Product product : productsArray) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
    
    // Binary search by product ID
    public Product binarySearchById(String productId) {
        int left = 0;
        int right = sortedProductsArray.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedProductsArray[mid].getProductId().compareTo(productId);
            
            if (comparison == 0) {
                return sortedProductsArray[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    
    // Linear search by product name
    public Product linearSearchByName(String productName) {
        for (Product product : productsArray) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
    
    // Display all products (for verification)
    public void displayProducts() {
        System.out.println("All Products:");
        for (Product product : productsArray) {
            System.out.println(product);
        }
    }
    
    // Display sorted products (for verification)
    public void displaySortedProducts() {
        System.out.println("Sorted Products (by ID):");
        for (Product product : sortedProductsArray) {
            System.out.println(product);
        }
    }
}