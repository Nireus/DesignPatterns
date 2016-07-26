/**
 * Created by Nireus on 2016-07-26.
 */
public abstract class Car {
    private int speed;
    private String color;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInformationAboutCar(){
        System.out.println("This is a " +name+ "\nit is "+color+"\nand can drive up to " + speed +"kmph.");
    }
}
