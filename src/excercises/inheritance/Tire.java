package excercises.inheritance;

public class Tire extends Part {
    private double size;
    private double width;

    public void setSize(double size) {
        this.size = size;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSize() {
        return size;
    }

    public double getWidth() {
        return width;
    }
}
