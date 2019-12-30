package scannerexercise;

import java.util.Scanner;

public class Exercise1 {
    private int sum;
    private int counter=0;

    private void ratingInput(){
        Scanner inputScanner = new Scanner(System.in);
        String x;

        int[][] rating = new int[3][];
        rating[0] = new int[4];
        rating[1] = new int[4];
        rating[2] = new int[4];

        for (int i = 0; i < rating.length; i++) {
            if (i == 0) {
                x = "Matematyka";
            } else if (i == 1) {
                x = "Fizyka";
            } else {
                x = "Historia";
            }
            System.out.println("Podaj 4 oceny z przedmiotu " + x + ", potwierdzajac enterem:");
            for (int j = 0; j < rating[i].length; j++) {
                System.out.println("Podaj ocene nr:" + (j + 1));
                rating[i][j] = inputScanner.nextInt();
                sum = sum + rating[i][j];
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.ratingInput();
        System.out.println("Twoja laczna srednia ocene to: "+exercise1.average());
    }
    private double average() {
        double avgAcc = (double)sum/counter;
        return avgAcc;
    }
}
