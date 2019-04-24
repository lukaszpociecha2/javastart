package excercises.exceptions;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setFuel(45);
        try {
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
            car.drive();
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println(car.getFuel());

        try {
            car.refuel(45);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}
