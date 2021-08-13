package Computation;

public class Multiply implements Computation {

    @Override
    public double compute(double argument1, double argument2) {

        double result = argument1 * argument2;
        return result;

    }
}
