package enums;

enum EyeColor {
    BLUE, GREEN, BROWN, GREY, UNIDENTIFIED
}
enum HairColor{
    BLOND, DARK, FAIR, GINGER, BLACK, BROWN, GREY
}
public class HumanEnum {
    private String name;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;

    public HumanEnum(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public static void main(String[] args) {
        HumanEnum human = new HumanEnum("John", 39, EyeColor.GREEN, HairColor.BLOND);
        System.out.println(human.eyeColor);
    }
}
