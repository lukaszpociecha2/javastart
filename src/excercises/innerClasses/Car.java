package excercises.innerClasses;

public class Car {

    private double fuel;
    private Engine engine;


    public Car(double fuel, String engineType, double fuelConsumption) {
        engine = new Engine(engineType, fuelConsumption);
        this.fuel = fuel;
        System.out.println("Car created. Engine type: " + this.engine.engineType +
                ", fuel consumption per 100KM: " + this.engine.FUEL_CONSUMPTION);
    }

    public void runCar() throws InterruptedException {
        while(fuel>0){
            System.out.println("Car running and consuming fuel. Fuel left: " + fuel);
            engine.consumeFuel();
            Thread.sleep(1000);
        }
        System.out.println("No more fuel");

    }

    public double getFuel() {
        return fuel;
    }

    public class Engine{
        private String engineType;
        private final double FUEL_CONSUMPTION;

        public Engine(String engineType, double FUEL_CONSUMPTION) {
            this.engineType = engineType;
            this.FUEL_CONSUMPTION = FUEL_CONSUMPTION;
        }

        public void consumeFuel(){
            fuel = fuel-FUEL_CONSUMPTION;
        }

        public String getEngineType() {
            return engineType;
        }

        public double getFUEL_CONSUMPTION() {
            return FUEL_CONSUMPTION;
        }
    }

}
