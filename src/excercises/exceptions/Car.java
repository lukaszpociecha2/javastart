package excercises.exceptions;

public class Car {

    private double fuel;
    private final double MAX_FUEL = 50;
    private final double FUEL_USAGE_PER_100KM = 8;

    public Car() {
    }

    public void refuel(double fuel){
        if((this.fuel + fuel)>MAX_FUEL){
            throw new IllegalArgumentException("Próbujesz zatankować za dużo paliwa. Możesz dolać " + (MAX_FUEL-this.fuel));
        } else {
           this.fuel += fuel;
            System.out.println("Aktualna ilosc paliwa: " + this.fuel);
        }
    }

    public void drive(){
        if (this.fuel>=FUEL_USAGE_PER_100KM){
            this.fuel-=FUEL_USAGE_PER_100KM;
            System.out.println("Jadę. Po przejechaniu zostało " + (this.fuel));
        } else {
            throw new IllegalStateException("Brak paliwa. Dotankuj");
        }
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
}
