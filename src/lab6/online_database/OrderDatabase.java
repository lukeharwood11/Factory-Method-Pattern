package lab6.online_database;

import java.util.HashMap;

/**
 *
 */
public class OrderDatabase {

    /**
     * Key : order-id
     * Value : order
     */
    private final HashMap<Integer, Order> activeOrders;

    /**
     * Controller for OrderDatabase
     */
    public OrderDatabase() {
        this.activeOrders = new HashMap<>();
    }

    public void addOrder(Order order) {
        this.activeOrders.put(order.getOrderId(), order);
    }

    public Order getOrder(int orderId) {
        return this.activeOrders.get(orderId);
    }

    public Order removeOrder(int orderId) {
        return this.activeOrders.remove(orderId);
    }

}
