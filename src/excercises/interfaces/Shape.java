package excercises.interfaces;

public interface Shape {

    Double PI = Math.PI;

    void calculatePerimiter();

    void calculateArea();

    default int increment(int i){
        return ++i;
    }

    static int decrement(int i){
        return --i;
    }

    default int getInt(int i){
        return i;
    }

}
