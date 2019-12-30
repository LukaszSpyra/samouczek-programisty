package equalshashcode;

public class Human {
    private String name;
    private String surname;
    private String sex;
    private String birthdayDate;

    public Human(String name, String surname, String sex, String birthdayDate) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
    }

    public boolean equals(Object object){
        if (object == null) {
            return false;
        }
        if (object instanceof Human){
            Human anotherHuman = (Human)object;
            return name.equals(anotherHuman.name)&& surname.equals(anotherHuman.surname)&& sex.equals(anotherHuman.sex) && birthdayDate.equals(anotherHuman.birthdayDate);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 7*name.hashCode()+11*surname.hashCode()+13*sex.hashCode()+17*birthdayDate.hashCode();
    }

    public static void main(String[] args) {
        Human human1 = new Human("Karol","Kowalski","Male","10.05.2001");
        Human human2 = new Human("Karol","Kowalski","Male","10.05.2001");
        System.out.println(human1.equals(human2));
    }
}
