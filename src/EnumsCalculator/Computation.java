package EnumsCalculator;

public enum Computation {

    MULTIPLY {
        public double perform(double a, double b){
            double multiplication = a * b;
            return multiplication;
        }
    },
    ADD{
        public double perform(double a, double b){
            double sum = a + b;
            return sum;
        }
    },
    DIVIDE{
        public double perform(double a, double b){
            double division = a/b;
            return division;
        }
    },
    SUBSTRACT{
        public double perform(double a, double b){
            double substraction = a - b;
            return substraction;
        }
    };

    public abstract double perform(double a, double b);
}
