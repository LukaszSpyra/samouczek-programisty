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

    private int[][] createUnitMatrix() {
        int[][] unitMatrix = new int[X][X];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                if (i == j) {
                    unitMatrix[i][j] = 1;
                } else {
                    unitMatrix[i][j] = 0;
                }
            }
        }
        return unitMatrix;
    }

}
