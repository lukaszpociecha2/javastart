package excercises.interfaces;

public interface Calculator {

    final static double PI = Math.PI;

    Shape getShapeFromUser();

    double calculatePerim(Shape shape);

    double calculateAr(Shape shape);



}
