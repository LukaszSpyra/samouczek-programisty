package polimorphism;

public abstract class Animal {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal goldfish = new Goldfish();
        System.out.println(human);
        System.out.println(goldfish);
    }
    }




