package Lambda;

import java.util.function.Predicate;

public class Zad2 {

    public static void main(String[] args) {

        Object object1 = new Object();
        Predicate<Object> objectPredicate = object2 -> object2.equals(object1);
        System.out.println(objectPredicate.test(object1));

        Predicate object3 = object1::equals;
        System.out.println(object3.test(object1));


    }
}
