package behavior.observer.subscriber2publisher;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Channel channelX = new Channel("ChannelX");

        User alan = new User("Alan");
        User bess = new User("Bess");
        User cathy = new User("Cathy");

        Message messageA = new Message("New video available!!!", "We published a new video");
        Message messageB = new Message("Big Sales!!!", "20% discount");
        Message messageC = new Message("Happy New Year", "Happy New Year");
        alan.sync(channelX);
        Thread.sleep(3000);
        channelX.addMessage(messageA);
        Thread.sleep(3000);
        alan.sync(channelX);
        Thread.sleep(3000);
        channelX.addMessage(messageB);
        channelX.addMessage(messageC);
        Thread.sleep(3000);
        alan.sync(channelX);
        bess.sync(channelX);
    }
}
