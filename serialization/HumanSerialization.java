package pl.samouczekprogramisty.serialization;

import java.io.*;
import java.util.Calendar;

public class HumanSerialization implements Serializable{
    String name;
    transient int age;

    public HumanSerialization(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        HumanSerialization human = new HumanSerialization("Karol",34);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("humanJava.bin"))){
            outputStream.writeObject(human);
        } catch (IOException e){
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("humanJava.bin"))){
            HumanSerialization humanFromFile = (HumanSerialization) inputStream.readObject();
            System.out.println(human.age+" " + human.name);
            System.out.println(humanFromFile.age+ " " +humanFromFile.name);
        } catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private void writeObject(ObjectOutputStream output) throws IOException{
        output.defaultWriteObject();
        int birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
        output.writeInt(birthYear);
    }

    private void readObject(ObjectInputStream input) throws IOException,ClassNotFoundException{
        input.defaultReadObject();
        age = Calendar.getInstance().get(Calendar.YEAR) - input.readInt();
    }
}
