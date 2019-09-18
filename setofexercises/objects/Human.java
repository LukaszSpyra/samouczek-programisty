package pl.samouczekprogramisty.setofexercises.objects;

public class Human {
    private int age = 30;
    private int weight = 76;
    private int height = 182;
    private boolean male = true;

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public boolean isMale() {
        return male;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getAge());
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
        System.out.println(human.isMale());
    }
}
