package pl.samouczekprogramisty.filesChanges;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class WritingFiles {
    private String path;

    private void setDestinationFilePath() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type absolute file patch:");
        path = inputScanner.nextLine();
    }

    private void writeDataToFile() {
        System.out.println("Type text line to be written to file, press: \"-\" followed by \"enter\" to end");
        Scanner inputScanner = new Scanner(System.in);
        boolean flag = true;

        try (
                FileWriter fileWriter = new FileWriter(path)
            ) {
            while (flag) {
                String textLine = inputScanner.nextLine();

                if (Objects.equals(textLine, "-")) {
                    flag = false;
                } else {
                    fileWriter.write(textLine + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        WritingFiles writingFiles = new WritingFiles();
        writingFiles.setDestinationFilePath();
        writingFiles.writeDataToFile();
    }
}

