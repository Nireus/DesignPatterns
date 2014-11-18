/**
 * Created by Nireus on 11/18/2014.
 */
public class SilverCoin extends Coin {
    public SilverCoin(){
        setValue("5");
        setName("Silver Coin");
        setColorStrategy(new Silver());
    }
}
