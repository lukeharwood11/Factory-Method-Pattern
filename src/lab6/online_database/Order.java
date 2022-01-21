package lab6.online_database;

import lab6.strategy_pattern.Toy;

public class Order {

    private static int orderCount = 0;
    private final Toy toy;
    private final double timeToFulfill;
    private double timeWaiting;
    private final boolean fulfilled;
    private final int orderId;
    private final int quantity;

    public Order(Toy toy, int quantity, double timeToFulfill) {
        this.toy = toy;
        this.timeToFulfill = timeToFulfill;
        this.fulfilled = false;
        this.timeWaiting = 0;
        this.orderId = orderCount++;
        this.quantity = quantity;
    }

    public double getTimeToFulFill() {
        return this.timeToFulfill;
    }

    public double getTimeWaiting() {
        return this.timeWaiting;
    }

    public void increaseTimeWaiting(double timeIncrease) {
        this.timeWaiting += timeIncrease;
    }

    public boolean isFulfilled() {
        return this.fulfilled;
    }

    public boolean isExpired() {
        return this.timeWaiting > this.timeToFulfill;
    }

    public Toy getToy() {
        return this.toy;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public int getQuantity() {
        return this.quantity;
    }

}
