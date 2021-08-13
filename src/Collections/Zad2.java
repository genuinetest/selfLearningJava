package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        Map<String, String> pairsMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String Man;
        String Woman;

        for(;;){
            System.out.println("Podaj imiona mężczyzny i kobiety. Aby skończyć wpisz -");
            Man = scanner.next();
            if(Man.equals("-")){
                break;
            }
            else {
                Woman = scanner.next();
                pairsMap.put(Man, Woman);
            }

        }
        int pairsMapSize = pairsMap.size();
        System.out.println(pairsMapSize);



    }

}
