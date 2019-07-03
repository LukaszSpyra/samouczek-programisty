package pl.samouczekprogramisty.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSorting {

    List<String> namesList = new ArrayList<>();

    List<String> getNamesFromUser (){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Type word "+(i+1)+" of 4");
            namesList.add(scanner.next());
        }
        return namesList;
    }

    @Override
    public String toString() {
        return namesList.toString();
    }

    public List<String> startSorting(){
        namesList.sort((a, b)-> b.length() - a.length() );
        return namesList;
    }


    public static void main(String[] args) {
        StringSorting stringSorting = new StringSorting();
        System.out.println(stringSorting.getNamesFromUser());
        System.out.println(stringSorting.startSorting());


    }


}
