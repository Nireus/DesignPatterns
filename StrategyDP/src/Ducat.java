/**
 * Created by Nireus on 11/18/2014.
 */
public class Ducat extends Coin{
    public Ducat(){
        setName("Ducat");
        setValue("1000");
        setColorStrategy(new Golden());
    }

}
