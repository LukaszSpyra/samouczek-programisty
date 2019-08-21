package pl.samouczekprogramisty.filesChanges;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SaveBirthdayDateToFile {

    private final static String path = "C:\\Users\\Spyrka PC\\Documents\\Programy JAVA\\Samouczek programisty\\src\\pl\\samouczekprogramisty\\filesChanges\\";

    private static String getDestinationFileName() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type file name:");
        String fileName = inputScanner.nextLine();
        return path + fileName + (".txt");
    }

    private static int[] saveUserBirthdayIn3NumbersDDmmYYYY() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type your birthday date in separate numbers: (DD MM YYYY)");
        System.out.println("Type number for \"DD\"");
        int dd = inputScanner.nextInt();
        System.out.println("Type number for \"MM\"");
        int mm = inputScanner.nextInt();
        System.out.println("Type number for \"YYYY\"");
        int yyyy = inputScanner.nextInt();

        int[] bithdayDate = new int[3];
        bithdayDate[0] = dd;
        bithdayDate[1] = mm;
        bithdayDate[2] = yyyy;
        return bithdayDate;

    }

    private static void saveBinaryUserDateToFile() throws IOException{
        DataOutputStream dataOutputStream = null;

        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(getDestinationFileName()));
            int[] birtdayDateResult = saveUserBirthdayIn3NumbersDDmmYYYY();
            dataOutputStream.writeInt(birtdayDateResult[0]);
            dataOutputStream.writeInt(birtdayDateResult[1]);
            dataOutputStream.writeInt(birtdayDateResult[2]);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream!=null)
                dataOutputStream.close();
        }
    }

    public static void main(String[] args) throws IOException {
        saveBinaryUserDateToFile();
    }
}
