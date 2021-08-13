package fileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku .txt bez wpisywania rozszerzenia");
        String fileName = scanner.next();

        String filePath = "D:\\Testowanie\\Java\\samouczekProgramisty\\files\\" + fileName + ".txt";

        //FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String text;

        try {
            //fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (; ; ) {
                System.out.println("Wprowadź linijkę tekstu. Jeśli chcesz zakończyć wprowadzanie, wprowadź \"-\"");
                text = scanner.nextLine();
                if(text.equals("-")){
                    break;
                }
                else {
                    bufferedWriter.write(text);
                    bufferedWriter.newLine();
                }
            }
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }

}
