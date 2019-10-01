package pl.samouczekprogramisty.setofexercises.interfaces;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[3];
        System.out.println("Type radius of the circle:");
        figuresArray[0] = new Circle(input.nextDouble());
        System.out.println("Type 2 sides of right triangle:");
        figuresArray[1] = new RightTriangle(input.nextDouble(), input.nextDouble());
        System.out.println("Type 2 sides of rectangle:");
        figuresArray[2] = new Rectangle(input.nextDouble(), input.nextDouble());

        for (Figure figure : figuresArray) {
            System.out.println("Area of the " + figure.getClass() + ":");
            System.out.println(figure.getArea());
            System.out.println("Perimeter of the " + figure.getClass() + ":");
            System.out.println(figure.getPerimeter());
        }
    }
}
