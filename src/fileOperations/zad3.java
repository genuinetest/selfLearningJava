package fileOperations;

import java.io.*;
import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku .txt bez wpisywania rozszerzenia");
        String fileName = scanner.next();

        String filePath = "D:\\Testowanie\\Java\\samouczekProgramisty\\files\\" + fileName + ".txt";

        DataOutputStream outputStream = null;

        System.out.println("Podaj dzień swoich urodzin");
        int dayOfBirth = scanner.nextInt();

        System.out.println("Podaj miesiąc swoich urodzin");
        int monthOfBirth = scanner.nextInt();

        System.out.println("Podaj rok swoich urodzin");
        int yearOfBirth = scanner.nextInt();


        try{
            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            outputStream.writeInt(dayOfBirth);
            outputStream.writeInt(monthOfBirth);
            outputStream.writeInt(yearOfBirth);

        } finally {
            if(outputStream != null){
                outputStream.close();
            }
        }


        int dayOfBirthFromFile = 0;
        int monthOfBirthFromFile = 0;
        int yearOfBirthFromFile = 0;
        DataInputStream inputStream = null;
        try{
            inputStream = new DataInputStream(new FileInputStream(filePath));
                dayOfBirthFromFile = inputStream.readInt();
                monthOfBirthFromFile = inputStream.readInt();
                yearOfBirthFromFile = inputStream.readInt();
                System.out.println("Moja data urodzin to " + dayOfBirthFromFile + "." +
                        monthOfBirthFromFile + "." + yearOfBirthFromFile);

        } finally {
            if(outputStream != null){
                outputStream.close();
            }
        }

    }
}
