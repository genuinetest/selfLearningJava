package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad1 {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawanie imion do zbioru");
        for(;;){
            System.out.println("Podaj Imię. Celem przerwania pętli wpisz \"-\"");
            String name = scanner.next();
            if(name.equals("-")){
                break;
            }
            else {
                names.add(name);
            }
        }

        int namesSize = names.size();
        System.out.println(namesSize);


    }

}
