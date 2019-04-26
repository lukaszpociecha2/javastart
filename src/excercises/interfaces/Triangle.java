package excercises.interfaces;

public class Triangle implements Shape {

    private double side;
    private double height;

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimiter() {
        return side*3;
    }

    @Override
    public double calculateArea() {
        return (side*height)/2;
    }
}
