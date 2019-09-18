package pl.samouczekprogramisty.setofexercises.array;

import java.util.Arrays;

public class ArraysExercises {

    public static String[] first5letters(){
        String[] letters = new String[] {"a","b","c","d","e"};
        return letters;
    }

    public static double[] reverseArray(double[] array)  {
        double[] reversedArray = new double[] {array[2], array[1], array[0]};
        return reversedArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(first5letters()));
        System.out.println(Arrays.toString(reverseArray(new double[] {1,2,3})));
    }
}
