public class Order {
    private State currentState;

    public Order() {
        currentState = new NewOrder();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void payOrder() {
        currentState.payOrder(this);
    }

    public void shipOrder() {
        currentState.shipOrder(this);
    }

    public void deliverOrder() {
        currentState.deliverOrder(this);
    }

    public void cancelOrder() {
        currentState.cancelOrder(this);
    }
}
