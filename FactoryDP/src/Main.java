import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String option = "";
        CarFactory factory = new CarFactory();
        Car car;
        while (true) {
            System.out.println("What car you want to manufacture? (L/F)");
            if (userInput.hasNextLine()) {
                option = userInput.nextLine();
            }
            car = factory.makeCar(option);
            car.getInformationAboutCar();
        }
    }
}
