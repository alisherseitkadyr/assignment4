public class RegularUser extends User {
    public RegularUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " (RegularUser): Sending Message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, User sender) {
        System.out.println(this.name + " (RegularUser): Received Message: " + message + " from " + sender.name);
    }
}
