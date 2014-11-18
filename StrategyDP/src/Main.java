import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Coin> listOfCoins = new ArrayList<Coin>();
        listOfCoins.add(new GoldCoin());
        listOfCoins.add(new SilverCoin());
        listOfCoins.add(new Ducat());


        for(Coin c: listOfCoins){
            System.out.println("----------------");
            System.out.println("Name: " + c.getName());
            System.out.println("Value: " + c.getValue());
            System.out.println("Color: " + c.getColorStrategy().getColor());
            System.out.println("----------------");
        }
    }
}
