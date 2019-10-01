package pl.samouczekprogramisty.setofexercises.objects;

public class Human {
    private Integer age = 30;
    private Integer weight = 76;
    private Integer height = 182;
    private Boolean male = true;

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean isMale() {
        return male;
    }

    public Integer getAge() {
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
