package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Zad1 {


    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("MaleńkaAlicja");
        words.add("w");
        words.add("krainie");
        words.add("czarów");
        words.add("kapelusznik");

        System.out.println(words);

        //words.sort((a, b) -> b.length() - a.length());
        words.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(words);




    }


}
