package pl.samouczekprogramisty.setofexercises.interfaces;

public class Circle implements Figure {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

}
