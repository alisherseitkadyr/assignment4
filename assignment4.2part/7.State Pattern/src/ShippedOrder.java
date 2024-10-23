public class ShippedOrder implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is delivered. Order is now in Delivered state.");
        order.setState(new DeliveredOrder());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled. It is already shipped.");
    }
}

