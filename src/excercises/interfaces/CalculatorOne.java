package excercises.interfaces;

import excercises.exceptions.NoElementFoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorOne implements Calculator {

    Scanner scanner = new Scanner(System.in);

    @Override
    public Shape getShapeFromUser() {
        System.out.println("Podaj kształt");

        System.out.println("Wybierz kształt: ");
        for (Options value : Options.values()) {
            System.out.println(value.getChoice() + " - " + value.name());
        }
        boolean isNumberCorrect = false;

        Shape shape = null;
        Options option = null;
        do {
            try {

                option = Options.getOptionFromUser(scanner.nextInt());
                isNumberCorrect = true;

            } catch (InputMismatchException e) {
                System.out.println("Zły wybór. Podaj jeszcze raz!");
            } catch (NoElementFoundException e) {
                System.out.println("nie ma takiego kształtu, wybierz jeszcze raz");
            } finally {
                scanner.nextLine();
            }
        } while (!isNumberCorrect);

        switch (option){
            case CIRCLE:
                shape = newCircle();
            break;
            case TRIANGLE:
                shape = newTriangle();
            break;
            case RECTANGLE:
                shape = newRectangle();
        }

        scanner.close();
        return shape;

    }

    private Circle newCircle(){
        Circle circle = null;
        System.out.println("Podaj radius");
        boolean isParamsCorrrect = false;
        double r=0;
        do {
            try {
                r = scanner.nextDouble();
                if (r <= 0) {
                    System.out.println("Nie moze byc ujemny. Podaj jeszcze raz");
                }
                isParamsCorrrect = true;
            } catch (InputMismatchException e){
                System.out.println("Nie podales liczby. Podaj jeszcze raz");
            } finally {
                scanner.nextLine();
            }
        } while (!isParamsCorrrect);
        circle = new Circle();
        circle.setRadius(r);
        return circle;
    }

    private Rectangle newRectangle(){
        Rectangle rectangle = null;

        boolean isParamsCorrrect = false;
        double a=0;
        double b=0;
        do {
            try {
                System.out.println("Podaj bok a");
                a = scanner.nextDouble();
                scanner.nextLine();
                if (a <= 0) {
                    System.out.println("Nie moze byc ujemny. Podaj jeszcze raz");
                }
                System.out.println("Podaj bok b");
                b= scanner.nextDouble();
                scanner.nextLine();
                if(b<=0){
                    System.out.println("Nie moze byc ujemny. Podaj jeszcze raz");
                }

                isParamsCorrrect = true;
            } catch (InputMismatchException e){
                System.out.println("Nie podales liczby. Podaj jeszcze raz");
                scanner.nextLine();
            }
        } while (!isParamsCorrrect);
        rectangle = new Rectangle();
        rectangle.setSideA(a);
        rectangle.setSideB(b);
        return rectangle;
    }

    private Triangle newTriangle(){
        Triangle triangle = null;
        boolean isParamsCorrrect = false;
        double side=0;
        double height=0;
        do {
            try {
                System.out.println("Podaj bok");
                side = scanner.nextDouble();
                scanner.nextLine();
                if (side <= 0) {
                    System.out.println("Nie moze byc ujemny. Podaj jeszcze raz");
                }

                height= scanner.nextDouble();
                scanner.nextLine();
                if(height<=0){
                    System.out.println("Nie moze byc ujemny. Podaj jeszcze raz");
                }

                isParamsCorrrect = true;
            } catch (InputMismatchException e){
                System.out.println("Nie podales liczby. Podaj jeszcze raz");
                scanner.nextLine();
            }
        } while (!isParamsCorrrect);
        triangle = new Triangle();
        triangle.setHeight(side);
        triangle.setHeight(height);
        return triangle;
    }



    @Override
    public double calculatePerim(Shape shape) {
        return shape.calculatePerimiter();
    }

    @Override
    public double calculateAr(Shape shape) {
        return shape.calculateArea();
    }
}
