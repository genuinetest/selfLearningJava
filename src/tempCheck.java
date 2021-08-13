public class tempCheck {

    public static void main(String[] args) {
        int temp;
        temp = (0);
        boolean isPositive = isPositive(temp);
        System.out.println(isPositive);
    }

    static boolean isPositive(int temp){
        boolean isPositive;
        if (temp > 0){
            isPositive = true;
        }
        else{
            isPositive = false;
        }
        return isPositive;
    }



}
