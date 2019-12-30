package fileschanges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles {
    private String path;

    private String getDestinationFilePath() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type absolute file patch:");
        path = inputScanner.nextLine();
        return path;
    }

    private void displayFileContent() throws IOException{
        BufferedReader bufferedReaded = null;

        try {
            bufferedReaded = new BufferedReader(new FileReader(getDestinationFilePath()));
            String fileContent = null;
            int counter = 0;
            while ((fileContent = bufferedReaded.readLine()) != null) {
                System.out.println(fileContent);
                counter++;
            }
            System.out.println();
            System.out.println("There are "+ counter +" lines in this file.");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bufferedReaded!=null){
                bufferedReaded.close();
            }
        }
    }

    public static void main(String[] args) throws IOException{
        ReadingFiles readingFiles = new ReadingFiles();
        readingFiles.displayFileContent();
    }
}
