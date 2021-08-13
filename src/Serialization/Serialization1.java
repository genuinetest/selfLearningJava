package Serialization;

import java.io.*;

public class Serialization1 implements Serializable {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] names = new String[]{"Marian", "Bozenka", "Jasio", "Kasio"};

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(".\\files\\names.bin"))){
            outputStream.writeObject(names);
        }

        String[] deserializedNames = null;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(".\\files\\names.bin"))){
            deserializedNames = (String[]) inputStream.readObject();
            for(int i = 0 ; i< deserializedNames.length; i++){
                String name = deserializedNames[i];
                System.out.println(name);
            }
        }

    }


}
