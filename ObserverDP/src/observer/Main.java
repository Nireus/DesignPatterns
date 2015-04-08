package observer;

/**
 * Created by Nireus on 4/8/2015.
 */
public class Main {
    public static void main(String[] args){
        MessagePublisher publisher = new MessagePublisher();
        MessageHistoryStorage messageHistoryStorage = new MessageHistoryStorage();
        MessageReader messageReader = new MessageReader();

        publisher.register(messageHistoryStorage);
        publisher.register(messageReader);

        publisher.setAutoBroadcast(true);
        publisher.setBroadcastMsg("message 1");
        publisher.setBroadcastMsg("message 2");
        messageHistoryStorage.printHistory();
        publisher.setBroadcastMsg("message 3");
        publisher.setBroadcastMsg("message 4");
        messageHistoryStorage.printHistory();

    }
}
