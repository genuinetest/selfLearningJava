import java.util.Arrays;
import java.util.Collections;

public class tables {

        int a = 5;
        int b = 3;
        int c = 10;
        int[] numbers = {a, b};


        int[] maxInt = {a, b, c};

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 45;
        Integer[] maxNumbers = new Integer[3];
        maxNumbers[0] = a;
        maxNumbers[1] = b;
        maxNumbers[2] = c;

        int max = Collections.max(Arrays.asList(maxNumbers));
        System.out.println(max);

    }

    int getIntAndSum(int[] numbers){
        int sum = numbers[0] + numbers[1];
        return sum;
    }

    void returnMaxNumberFromTable(){
        //System.out.println(Math.max(maxNumber[]);
    }
}
