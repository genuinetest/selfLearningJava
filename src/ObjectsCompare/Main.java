package ObjectsCompare;

public class Main {


    public static void main(String[] args) {
        Human Wojtek = new Human("Wojtek", "Maciejewski", "189", "Polan", "80808080");
        Human WojtekDwa = new Human("Wojtek", "Maciejewski", "189", "Polan", "80808080");
        Human Marian = new Human("Wojtek", "Maciejewski", "189", "Polan", "80808081");



        System.out.println("chair1.equals(chair2): " + Wojtek.equals(WojtekDwa));
        System.out.println("chair1.equals(chair3): " + Wojtek.equals(Marian));
        System.out.println("chair1.equals(null): " + Wojtek.equals(null));
    }




}
