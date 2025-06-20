package SortingOrder;

public class Main {
    public static void main(String[] args) {
        // Create sample orders
        Order[] orders = {
            new Order("ORD100", "John Smith", 149.99),
            new Order("ORD101", "Alice Johnson", 89.50),
            new Order("ORD102", "Bob Williams", 245.75),
            new Order("ORD103", "Carol Brown", 59.99),
            new Order("ORD104", "David Miller", 199.00),
            new Order("ORD105", "Eva Davis", 32.50)
        };
        
        OrderSorter sorter = new OrderSorter();
        
        // Make copies for each sorting algorithm
        Order[] ordersForBubbleSort = orders.clone();
        Order[] ordersForQuickSort = orders.clone();
        
        System.out.println("Original Orders:");
        sorter.printOrders(orders);
        System.out.println();
        
        // Bubble Sort
        System.out.println("Sorting with Bubble Sort...");
        sorter.bubbleSort(ordersForBubbleSort);
        System.out.println("Orders sorted by total price (Bubble Sort):");
        sorter.printOrders(ordersForBubbleSort);
        System.out.println();
        
        // Quick Sort
        System.out.println("Sorting with Quick Sort...");
        sorter.quickSort(ordersForQuickSort);
        System.out.println("Orders sorted by total price (Quick Sort):");
        sorter.printOrders(ordersForQuickSort);
    }
}
