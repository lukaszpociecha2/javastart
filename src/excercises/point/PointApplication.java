package excercises.point;

import excercises.point.data.Point;
import excercises.point.logic.PointController;

public class PointApplication {

    public static void main(String[] args) {


        Point point = new Point(0, 0);
        PointController pc = new PointController();

        final int ADD_X = 1;
        final int MINUS_X = 2;
        final int ADD_Y = 3;
        final int MINUS_Y = 4;

        int choice = 5;

        switch (choice) {
            case ADD_X:
                pc.addX(point);
                break;
            case MINUS_X:
                pc.minusX(point);
                break;
            case ADD_Y:
                pc.addY(point);
                break;
            case MINUS_Y:
                pc.minusY(point);
                break;
                default:
                    System.out.println("Podano błędną wartość");
        }

        System.out.println(point.getX() + ", " + point.getY());

    }


}
