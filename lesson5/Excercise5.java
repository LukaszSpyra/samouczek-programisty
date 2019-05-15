package pl.samouczekprogramisty.lesson5;

public class Excercise5 {

    private int sumUp = 0;
    private int sumUp2 = 0;

    private int sum (int[] board) {
        for (int i : board) {
            sumUp = sumUp + i;
        }
        return sumUp;
        }

    private int sum2 (int[][] board2){
        for (int j = 0; j < board2.length; j++) {
            for (int k = 0; k < board2[j].length; k++) {
                sumUp2 = sumUp2 + board2[j][k];
            }
        }
        return sumUp2;
    }

    public static void main(String[] args) {
        Excercise5 excercise5 = new Excercise5();
        int[] sampleBoard = new int[]{1,2,2,10,10};
        int[][] sampleBoard2 = {{1,2,2,10,10},{1,1,2,1},{5}};
        System.out.println(excercise5.sum(sampleBoard));
        System.out.println(excercise5.sum2(sampleBoard2));
    }
}
