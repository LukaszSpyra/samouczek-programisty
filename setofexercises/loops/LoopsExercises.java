package pl.samouczekprogramisty.setofexercises.loops;

public class LoopsExercises {

    private static void printNumberFrom0ToXinTwoLoops(int x){
        if (x<0){
            throw new IllegalArgumentException("Number must be > 0 ");
        }
        for (int i = 0; i <= x; i++) {
            System.out.print(i);
        }
        System.out.println();
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
        System.out.println("");
        System.out.println(reversed);
    }

    private static String reverseString(String word){
        char[] charArray = word.toCharArray();
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length ; i++) {
            reversedArray[reversedArray.length-1-i] = charArray[i];
        }
        String reversedWord = String.valueOf(reversedArray);
        System.out.println(reversedWord);
        return reversedWord;
    }

    private static void convertToBinary(int numberToBeConverted){
        System.out.println("Result from method Integer.toBinaryString: " + Integer.toBinaryString(numberToBeConverted));
        StringBuilder reversedBinary = new StringBuilder();
        while (numberToBeConverted > 0){
            reversedBinary.append(numberToBeConverted % 2);
            numberToBeConverted /=2;
        }
        reverseString(reversedBinary.toString());
    }

    public static void main(String[] args) {
        printNumberFrom0ToXinTwoLoops(7);
        printSeparateDigitsReversedFromNumber();
        reverseString("Monika");
        convertToBinary(1234);
    }
}
