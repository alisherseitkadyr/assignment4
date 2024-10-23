public class DeliveredOrder implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid and delivered.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled. It is already delivered.");
    }
}
