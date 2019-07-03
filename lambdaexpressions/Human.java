package pl.samouczekprogramisty.lambdaexpressions;

import java.util.function.BiFunction;

public class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BiFunction<Integer,String,Human> humanBiFunction = Human::new;
        Human human = new Human(28, "Zenon");
        Human human1 = humanBiFunction.apply(29, "Mietek");
    }
}
