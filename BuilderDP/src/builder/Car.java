package builder;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Nireus on 6/23/2015.
 */
public class Car {
    private final String brand;
    private final String model;
    private final String description;
    private final BigInteger insuranceNumber;
    private final String vin;
    private final Date productionDate;
    private final String color;

    public static class CarBuilder {
        private final String brand;
        private final String model;
        private  String description = "";
        private  BigInteger insuranceNumber = new BigInteger("0");
        private  String vin = "";
        private Date productionDate = null;
        private  String color = "";

        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder description(String description){
            this.description = description;
            return this;
        }

        public CarBuilder insuranceNumber(BigInteger insuranceNumber){
            this.insuranceNumber = insuranceNumber;
            return this;
        }

        public CarBuilder vin(String vin){
            this.vin = vin;
            return this;
        }

        public CarBuilder productionDate(Date productionDate){
            this.productionDate = productionDate;
            return this;
        }

        public CarBuilder color(String color){
            this.color = color;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

    private Car(CarBuilder builder) {
        brand = builder.brand;
        model = builder.model;
        description = builder.description;
        insuranceNumber = builder.insuranceNumber;
        vin = builder.vin;
        productionDate = builder.productionDate;
        color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                ", vin='" + vin + '\'' +
                ", productionDate=" + productionDate +
                ", color='" + color + '\'' +
                '}';
    }
}
