public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("Initial state: New Order");
        order.payOrder();
        order.shipOrder();
        order.deliverOrder();

        System.out.println("\nCreating a new order and cancelling it:");
        Order newOrder = new Order();
        newOrder.cancelOrder();

        System.out.println("\nAttempting to cancel a shipped order:");
        Order shippedOrder = new Order();
        shippedOrder.payOrder();
        shippedOrder.shipOrder();
        shippedOrder.cancelOrder();
    }
}
