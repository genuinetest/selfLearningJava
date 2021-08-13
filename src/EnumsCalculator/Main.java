package EnumsCalculator;

public class Main {

    private Computation computation;

    public Main(Computation computation){
        this.computation = computation;
    }

    public static void main(String[] args) {

        double main = Computation.ADD.perform(5,5);
        System.out.println(main);
    }
}
