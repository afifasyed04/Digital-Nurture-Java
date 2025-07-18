package SortingOrder;

public class Order implements Comparable<Order> {
    private String orderId;
    private String customerName;
    private double totalPrice;
    
    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    
    // Getters
    public String getOrderId() {
        return orderId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    @Override
    public int compareTo(Order other) {
        return Double.compare(this.totalPrice, other.totalPrice);
    }
    
    @Override
    public String toString() {
        return String.format("Order [ID=%s, Customer=%s, Total=$%.2f]", 
                            orderId, customerName, totalPrice);
    }
}
