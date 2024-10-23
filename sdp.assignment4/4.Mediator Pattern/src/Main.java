public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new PremiumUser(chatRoom, "Bob");
        User user3 = new RegularUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hi everyone!");
        user2.sendMessage("Hello Alice!");
        user3.sendMessage("Hey there!");
    }
}
