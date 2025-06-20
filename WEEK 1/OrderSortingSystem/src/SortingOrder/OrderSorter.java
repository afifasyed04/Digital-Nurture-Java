package SortingOrder;

public class OrderSorter {
    
    // Bubble Sort implementation
    public void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (orders[j].getTotalPrice() > orders[j+1].getTotalPrice()) {
                    // Swap orders[j] and orders[j+1]
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped) break;
        }
    }
    
    // Quick Sort implementation
    public void quickSort(Order[] orders) {
        quickSort(orders, 0, orders.length - 1);
    }
    
    private void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            
            quickSort(orders, low, pi - 1);  // Before pivot
            quickSort(orders, pi + 1, high); // After pivot
        }
    }
    
    private int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        
        // Swap orders[i+1] and orders[high] (pivot)
        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;
        
        return i + 1;
    }
    
    // Utility method to print array of orders
    public void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}