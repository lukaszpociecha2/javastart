package excercises.interfaces;

public class Rectangle implements Shape {

    private double sideA;
    private double sideB;

    public Rectangle() {
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double calculatePerimiter() {
        return 2*sideB*sideA;
    }


    @Override
    public double calculateArea() {
        return sideA*sideB;
    }

}

