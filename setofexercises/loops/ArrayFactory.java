package pl.samouczekprogramisty.setofexercises.loops;

public class ArrayFactory {
    private final int X;

    public ArrayFactory(int x) {
        X = x;
    }

    private int[] oneDimension(){
        return new int[X];
    }

    private int[][] twoDimensions(){
        return new int[X][X];
    }

}
