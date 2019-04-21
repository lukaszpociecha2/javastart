package excercises.point.logic;

import excercises.point.data.Point;


public class PointController {

    //Point point;

    /*public PointController(Point point) {
        this.point = point;
    }*/

    public void addX(Point point) {
        point.setX(point.getX() + 1);
    }

    public void addY(Point point) {
        point.setY(point.getY() + 1);
    }

    public void minusX(Point point) {
        point.setX(point.getX() - 1);
    }

    public void minusY(Point point) {
        point.setY(point.getY() - 1);
    }

    public void changeObject(Point point) {
        point = new Point(100, 100);
        System.out.println("Obiekt point wywołany w metodzie:" + point.getX() + ", " + point.getY());

    }

}
