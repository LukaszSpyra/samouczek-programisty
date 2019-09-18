package pl.samouczekprogramisty.setofexercises.objects;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateDiagonal());
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return (length * 2) + (width * 2);
    }

    public double calculateDiagonal() {
        return Math.hypot(length, width);
    }
}
