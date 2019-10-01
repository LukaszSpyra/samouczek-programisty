package pl.samouczekprogramisty.setofexercises.primitivetypes;

import java.util.Scanner;

import static pl.samouczekprogramisty.setofexercises.loops.LoopsExercises.*;

public class PrimitiveTypes {

    private static int getIntegerFromUser(){
        System.out.println("Type integer number:");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static void printSortedArrayFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type Array length:");
        int N = input.nextInt();
        int[] userArray = new int[N];
        System.out.println("Type " + N + "numbers to fill the array:");
        for (int i = 0; i < N; i++) {
            System.out.println("Number: " + (i+1));
            userArray[i] = input.nextInt();
        }
        System.out.println("End of array");
        arraySorting(userArray);
    }

     private static String getStringFromUserAndPrintLength(){
        System.out.println("Type String: ");
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine();
        System.out.println("Lenght of given string: " + userString.length());
        reverseString(userString);
        return userString;
     }

    public static void main(String[] args) {
        //convertToBinary(getIntegerFromUser());
        //printSortedArrayFromUser();
        System.out.println(checkPalindrome(getStringFromUserAndPrintLength()));

    }
}
