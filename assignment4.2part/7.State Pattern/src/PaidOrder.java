public class PaidOrder implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is shipped. Order is now in Shipped state.");
        order.setState(new ShippedOrder());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered. It needs to be shipped first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after payment.");
    }
}
