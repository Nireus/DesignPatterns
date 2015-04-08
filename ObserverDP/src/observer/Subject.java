package observer;

/**
 * Created by Nireus on 4/8/2015.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
