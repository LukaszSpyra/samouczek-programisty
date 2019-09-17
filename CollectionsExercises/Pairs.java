package pl.samouczekprogramisty.CollectionsExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pairs {

    public static final String END_OF_NAMES = "-";

    public static void main(String[] args) {
        Map<String, String> pairsMap = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kolejno imiona par, wcisnij \"-\" aby zakonczyc wprowadzanie.");

        while (true) {

            System.out.println("Podaj pierwsze imie z pary:");
            String name1 = input.next();
            if (name1.equals(END_OF_NAMES)) {
                break;
            }
            System.out.println("Podaj drugie imie z pary:");
            String name2 = input.next();
            if (name2.equals(END_OF_NAMES)) {
                break;
            }
            pairsMap.put(name1, name2);
        }

        System.out.println("Podaj pierwsze imie, aby wyswietlic pare:");
        String name1 = input.next();

                System.out.println("Dane pary " + name1 + " " + pairsMap.get(name1));
    }
}
