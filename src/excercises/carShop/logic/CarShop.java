package excercises.carShop.logic;


import excercises.carShop.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audi1 = new Car(2010, "Audi", "A4", "red");
        Car audi2 = new Car(2015, "Audi", "Q5");

        audi2.setColor("black");

        System.out.println("Wybrałeś następujący samochód: ");
        audi2.print();
        System.out.println(audi2.getColor());

    }

}
