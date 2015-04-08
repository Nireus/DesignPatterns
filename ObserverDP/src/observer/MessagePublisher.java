package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nireus on 4/8/2015.
 */
public class MessagePublisher implements Subject {

    private List<Observer> observers;
    private String broadcastMsg;
    private Boolean autoBroadcast;

    public MessagePublisher(){
        observers = new ArrayList<Observer>();
        broadcastMsg = "";
        autoBroadcast = false;
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
        System.out.println("Added new observer");
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int obsIndex = observers.indexOf(deleteObserver);
        System.out.println("Removing observer on index: " + obsIndex);
        observers.remove(obsIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : observers){
            obs.update(broadcastMsg);
        }
    }

    public void setBroadcastMsg(String broadcastMsg) {
        this.broadcastMsg = broadcastMsg;
        if(autoBroadcast){
            notifyObserver();
        }
    }

    public void setAutoBroadcast(Boolean autoBroadcast) {
        this.autoBroadcast = autoBroadcast;
    }
}
