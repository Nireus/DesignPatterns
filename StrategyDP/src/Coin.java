/**
 * Created by Nireus on 11/18/2014.
 */
public class Coin {

    private String value;
    private ColorStrategy colorStrategy;
    private String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ColorStrategy getColorStrategy() {
        return colorStrategy;
    }

    public void setColorStrategy(ColorStrategy colorStrategy) {
        this.colorStrategy = colorStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
