package observer;

/**
 * Created by Nireus on 4/8/2015.
 */
public class MessageReader implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("Message reader: " + msg);
    }
}
