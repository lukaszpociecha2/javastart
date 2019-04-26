package excercises.interfaces;

public class Circle implements Shape {

    private double radius;

    @Override
    public double calculatePerimiter() {
        return this.radius*2*Shape.PI;
    }

    @Override
    public double calculateArea() {
        return this.radius*this.radius*Shape.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
