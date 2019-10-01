package pl.samouczekprogramisty.setofexercises.interfaces;

public class RightTriangle implements Figure {
    protected double leg1;
    protected double leg2;

    protected RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getPerimeter(){
        return leg1 + leg2 + Math.sqrt(Math.pow(leg1,2) + Math.pow(leg2,2));
    }

    public double getArea(){
        return 0.5 * leg1 * leg2;
    }
}
