public class CancelledOrder implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is cancelled and cannot be paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is cancelled and cannot be shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is cancelled and cannot be delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
