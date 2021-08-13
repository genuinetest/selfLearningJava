package fileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku .txt bez wpisywania rozszerzenia");
        String fileName = scanner.next();

        String filePath = "D:\\Testowanie\\Java\\samouczekProgramisty\\files\\" + fileName + ".txt";

        BufferedReader filereader = null;

        try{
            filereader = new BufferedReader(new FileReader((filePath)));
            int lineNumber = 0;
            for(lineNumber = 0;;lineNumber++){
                String textRead = filereader.readLine();
                if(textRead == null){
                    System.out.println(lineNumber);
                    break;
                }
                System.out.println(textRead);
            }
        } finally {
            if(filereader != null){
                filereader.close();
            }
        }


    }



}
