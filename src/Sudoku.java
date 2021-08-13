import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numberOfClasses = 3;
        int numberOfNotes = 4;
        int average = averageGrade(3,4);
        System.out.println("średnia wynosi " + average);

    }

    public static int averageGrade(int numberOfClasses, int numberOfNotes){
        Scanner inputScanner = new Scanner(System.in);
        int sumOfNotes =0;
        for (int classIndex = 0; classIndex<numberOfClasses; classIndex++){
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++){
                System.out.println("Wprowadź ocenę " + noteIndex + " z przedmiotu " + classIndex);
                int ocena = inputScanner.nextInt();
                sumOfNotes = sumOfNotes + ocena;
            }
        }
        int average = sumOfNotes/(numberOfNotes*numberOfClasses);
        return average;
    }

}
