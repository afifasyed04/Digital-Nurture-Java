package Inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        // Adding products
        manager.addProduct(new Product("P001", "Laptop", 10, 999.99));
        manager.addProduct(new Product("P002", "Smartphone", 25, 699.99));
        manager.addProduct(new Product("P003", "Headphones", 50, 99.99));
        
        // Display inventory
        manager.displayInventory();
        
        // Update a product
        manager.updateProduct("P002", "Premium Smartphone", 20, 799.99);
        
        // Display inventory after update
        manager.displayInventory();
        
        // Delete a product
        manager.deleteProduct("P003");
        
        // Display inventory after deletion
        manager.displayInventory();
        
        // Try to get a product
        Product product = manager.getProduct("P001");
        if (product != null) {
            System.out.println("Retrieved product: " + product);
        }
    }
}
