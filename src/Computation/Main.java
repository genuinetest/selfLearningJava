package Computation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Computation computation;


        System.out.println("Podaj liczbę 1:");
        double a = getArgument();

        System.out.println("Podaj liczbę 2:");
        double b = getArgument();

        if (main.shouldMultiply() == true) {
            computation = new Multiply(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Add(); // zaimplementuj brakującą klasę
        }

        double result = computation.compute(a, b);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("should Multiply (true) or Add (false)?");
        String shouldMultiply = scanner.next();

        if (shouldMultiply.equals("true")){
            return true;
        }
        return false;
         // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private static double getArgument() {

        Scanner scanner = new Scanner(System.in);

        double argument = scanner.nextDouble();
        return argument; // tutaj pobierz liczbę od użytkownika
    }

}
