package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nireus on 4/8/2015.
 */
public class MessageHistoryStorage implements Observer{

    private List<String> msgHistory;

    MessageHistoryStorage(){
        msgHistory = new ArrayList<String>();
    }

    @Override
    public void update(String msg) {
        msgHistory.add(msg);
    }

    public void printHistory(){
        System.out.println("Printing message history: ");
        for(String s : msgHistory){
            System.out.println(s);
        }
    }
}
