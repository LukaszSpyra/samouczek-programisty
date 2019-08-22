package pl.samouczekprogramisty.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamesDatabase {

    private static final String path = "C:\\Users\\Spyrka PC\\Documents\\Programy JAVA\\Samouczek programisty\\src\\pl\\samouczekprogramisty\\serialization\\namesDatabase.db";

    public static void main(String[] args) {
        saveNamesToFile();
        System.out.println(displayNamesFromFile());

    }

    private static List<String> displayNamesFromFile() {
        List<String> namesListFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))){
            namesListFromFile = (List<String>) inputStream.readObject();
        } catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return namesListFromFile;
    }

    private static void saveNamesToFile(){
        System.out.println("Podaj 5 imion, potwierdzajac kazde enterem:");
        Scanner namesInput = new Scanner(System.in);
        List<String> namesList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            namesList.add(namesInput.nextLine());
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))){
            outputStream.writeObject(namesList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
