/**
 * Created by Nireus on 11/18/2014.
 */
public class GoldCoin extends Coin{
    public GoldCoin(){
        setValue("10");
        setName("Gold Coin");
        setColorStrategy(new Golden());
    }
}
