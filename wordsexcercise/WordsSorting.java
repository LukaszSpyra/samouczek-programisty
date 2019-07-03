package pl.samouczekprogramisty.wordsexcercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordsSorting {

    private List<String> namesList = new LinkedList<>();

    public String toString(){
        return namesList.toString();
    }

    private List<String> getNamesFromUser() {
        System.out.println("Type 5 words:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Type word nr" + (i+1));
            String input = scanner.next();
            namesList.add(input);
        } return namesList;
    }

    class WordsComparator implements Comparator<String> {

        public int compare(String l1, String l2){
            return l1.length() - l2.length();
            }
    }

    private List<String> startSorting(){
        Collections.sort(namesList, new WordsComparator());
        return namesList;
    }

    public static void main(String[] args) {
        WordsSorting wordsSorting = new WordsSorting();
        wordsSorting.getNamesFromUser();
        System.out.println(wordsSorting);
        System.out.println(wordsSorting.startSorting());
           }
}
