package builder;

import java.util.Date;

/**
 * Created by Nireus on 6/23/2015.
 */
public class Main {
    public static void main(String[] args){
        Car car1 = new Car.CarBuilder("opel","astra").color("red").description("with 1 accident").vin("AS876DS7D6").build();
        Car car2 = new Car.CarBuilder("opel","vectra").color("blue").productionDate(new Date()).build();

        System.out.println(car1);
        System.out.println(car2);
    }
}