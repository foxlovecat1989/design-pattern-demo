package behavior.observer.publisher2subscriber;

public class Client {
    public static void main(String[] args) {
        Channel channelX = new Channel("ChannelX");
        Channel channelY = new Channel("ChannelY");

        User alan = new User("Alan");
        User bess = new User("Bess");
        User cathy = new User("Cathy");
        User david = new User("David");
        User eva = new User("Eva");

        alan.subscribe(channelX);
        bess.subscribe(channelX);
        cathy.subscribe(channelY);
        david.subscribe(channelY);
        eva.subscribe(channelY);

        Message messageA = new Message("New video available!!!", "We published a new video");
        Message messageB = new Message("Big Sales!!!", "20% discount");

        channelX.publishAll(messageA);
        channelY.publishAll(messageB);
    }
}
