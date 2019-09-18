package pl.samouczekprogramisty.setofexercises.methods;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

    private static void calculateUserAge() {
        int[] userBirthDateIn3digitsDDMMYYYY = getUserBirthDateIn3digitsDDMMYYYY();
        int age = Calendar.getInstance().get(Calendar.YEAR) - userBirthDateIn3digitsDDMMYYYY[2];
        int month = Calendar.getInstance().get(Calendar.MONTH)+1;
        if (userBirthDateIn3digitsDDMMYYYY[1] > month) {
            age = age - 1;
            System.out.println(Calendar.getInstance().get(Calendar.MONTH));
        } else if (userBirthDateIn3digitsDDMMYYYY[1] == month){
            if (userBirthDateIn3digitsDDMMYYYY[0] > Calendar.getInstance().get(Calendar.DAY_OF_MONTH)){
                age = age - 1;
            }
        }
        System.out.println(age);
    }

    private static int[] getUserBirthDateIn3digitsDDMMYYYY () {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type your birthday date in separate numbers: (DD MM YYYY)");
        System.out.println("Type number for \"DD\"");
        int dd = inputScanner.nextInt();
        System.out.println("Type number for \"MM\"");
        int mm = inputScanner.nextInt();
        System.out.println("Type number for \"YYYY\"");
        int yyyy = inputScanner.nextInt();
        int[] birthdayDate = new int[3];
        birthdayDate[0] = dd;
        birthdayDate[1] = mm;
        birthdayDate[2] = yyyy;
        return birthdayDate;
    }

    public static void main (String[] args){
        calculateUserAge();
    }
}
