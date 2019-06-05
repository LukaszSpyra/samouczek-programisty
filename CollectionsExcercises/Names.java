package pl.samouczekprogramisty.CollectionsExcercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {

    private static String getName (){
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static void main(String[] args) {
        System.out.println("Write names to be added to the list, type \"-\" upon completion.");

        Set<String> names = new HashSet<>();

        while (true) {
            String name = getName();
            if (name.equals("-")) {
                break;
            }
            names.add(name);
        }

        for (String anotherName : names)
            {
                System.out.println(anotherName);
        }
    }
}
