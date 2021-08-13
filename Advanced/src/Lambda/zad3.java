package Lambda;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class zad3 {

    public static void main(String[] args) {
        BiFunction<Integer, String, Human> humanContrutor = Human::new;
        Human human = humanContrutor.apply(25, "Wojtaz");
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }

}
