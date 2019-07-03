package pl.samouczekprogramisty.lambdaexpressions;

import java.util.function.Predicate;

public class EqualsExcercise {

    public static void main(String[] args) {

        Object object = new Object();
        /* albo lambda odwolanie do kontruktora!!(Object::new i potem .get() na obiekcie:
        Supplier<Object> supplierobject = Object::new;
        Object objectInstance = supplierobject.get();
         */

        Predicate<Object> result = object::equals;
        result.test(new Object());
        /* interfejs funkcyjny zwraca flage jesli odpowiadaja sobie argumenty, ma metode abstrakcyjna test(T t) czyli
        ten sam typ obiektu jak porownywany ten co wywoluje.
        Lambda pobiera metode equals z instancji!! obiektu.
        normalnie moznaby to zapisac: object.equals(new Object);
         */


    }
}
