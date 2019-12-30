package fileschanges;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DisplayBirthdayDateFromFile {

    private String getDestinationFilePath() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type absolute file patch:");
        return inputScanner.nextLine();
    }

    private void displayFileContent() throws IOException{
        DataInputStream inputStream = null;

        int fileContent;
        try {
            inputStream = new DataInputStream(new FileInputStream(getDestinationFilePath()));
            fileContent = inputStream.readInt();
            System.out.println(fileContent);
            fileContent = inputStream.readInt();
            System.out.println(fileContent);
            fileContent = inputStream.readInt();
            System.out.println(fileContent);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (inputStream!=null){
                inputStream.close();
            }
        }
    }

    public static void main(String[] args) throws IOException{
        DisplayBirthdayDateFromFile displayBirthdayDateFromFile = new DisplayBirthdayDateFromFile();
        displayBirthdayDateFromFile.displayFileContent();
    }

}

