package pl.samouczekprogramisty.setofexercises.loops;

import java.util.Arrays;

public class LoopsExercises {

    private static void printNumberFrom0ToXinTwoLoops(int x){
        if (x<0){
            throw new IllegalArgumentException("Number must be > 0 ");
        }
        //first way of printing in for loop
        for (int i = 0; i <= x; i++) {
            System.out.print(i);
        }
        System.out.println();
        //second way of printing in while loop
        int j = 0;
        while (j <= x){
            System.out.print(j++);
        }
        System.out.println();
    }

    private static void printSeparateDigitsReversedFromNumber() {
        int number = 8960;
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
            System.out.print(lastDigit);
        }
        System.out.println();
        System.out.println(reversed);
    }

    public static String reverseString(String word){
        char[] charArray = word.toCharArray();
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length ; i++) {
            reversedArray[reversedArray.length-1-i] = charArray[i];
        }
        String reversedWord = String.valueOf(reversedArray);
        System.out.println(reversedWord);
        return reversedWord;
    }

    public static void convertToBinary(int numberToBeConverted){
        System.out.println("Result from method Integer.toBinaryString: " + Integer.toBinaryString(numberToBeConverted));
        StringBuilder reversedBinary = new StringBuilder();
        while (numberToBeConverted > 0){
            reversedBinary.append(numberToBeConverted % 2);
            numberToBeConverted /=2;
        }
        reverseString(reversedBinary.toString());
    }

    public static boolean checkPalindrome(String word){
        //1st solution - using previously created method
        //return word.equalsIgnoreCase(reverseString(word));
        //2nd solution - independent
        System.out.println("Checking palindrome in progress...");
        String wordLowerCase = word.toLowerCase();
        char[] chars = wordLowerCase.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char currentLetter = chars[i];
            char correspondingLetter = chars[chars.length - 1 - i];
            if (!(currentLetter == correspondingLetter)){
                return false;
            }
        }
    return true;
    }

    private static void printIntArray(int[] intArray){
        //1st solution
        //System.out.println(Arrays.toString(intArray));
        //2nd solution
        System.out.print("[");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i == intArray.length-1){
                break;
            }
            System.out.print(", ");
        }
        System.out.print("]");
    }

    public static void arraySorting(int[] intArray){
        //1st way of ascending sorting
        //Arrays.sort(intArray);
        //System.out.println(Arrays.toString(intArray));
        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void main(String[] args) {
        printNumberFrom0ToXinTwoLoops(7);
        printSeparateDigitsReversedFromNumber();
        reverseString("Monika");
        convertToBinary(1234);
        System.out.println(checkPalindrome("woow"));
        printIntArray(new int[] {1, 3, 5});
        arraySorting(new int[]{9, 2, 34, 1, -9, 0});
    }
}
