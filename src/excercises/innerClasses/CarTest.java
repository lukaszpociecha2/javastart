package excercises.innerClasses;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car(60, "V6", 12);
        System.out.println(car.getFuel());

        try {
            car.runCar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(car.getFuel());

        Car.Engine v8 = new Car(10, "V12", 30).
                new Engine("V8", 14);

        System.out.println(v8.getEngineType() + " " + v8.getFUEL_CONSUMPTION());
        // this is a funny situation when due to encapsulation of inner class object instance two objects of the
        // inner class are created. change required in constructors. If inner class static

        // Car.Engine staticEngine = new Car.Engine("v12", 15);
    }

}
