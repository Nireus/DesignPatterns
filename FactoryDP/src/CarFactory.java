/**
 * Created by Nireus on 2016-07-26.
 */
public class CarFactory {
    public Car makeCar(String carType) {
        if (carType.equals("F")) {
            return new Ferrari();
        } else {
            return new Lamborghini();
        }


    }
}
