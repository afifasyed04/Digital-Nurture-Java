package Inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory;
    
    public InventoryManager() {
        inventory = new HashMap<>();
    }
    
    // Add a new product to inventory
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }
    
    // Update an existing product
    public void updateProduct(String productId, String newName, int newQuantity, double newPrice) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
    
    // Delete a product from inventory
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
    
    // Display all products in inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        
        System.out.println("Current Inventory:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
    
    // Get a product by ID
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
}
