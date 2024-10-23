public class NewOrder implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Payment received. Order is now in Paid state.");
        order.setState(new PaidOrder());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped. Payment is required first.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered. Payment and shipping are required first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrder());
    }
}
