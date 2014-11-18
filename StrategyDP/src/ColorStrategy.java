/**
 * Created by Nireus on 11/18/2014.
 */
public interface ColorStrategy {

    String getColor();
}

class Golden implements ColorStrategy {

    @Override
    public String getColor() {
        return "Golden";
    }
}

class Silver implements ColorStrategy {
    @Override
    public String getColor() {
        return "Silver";
    }
}
