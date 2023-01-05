package core.basics.loops.inclass;

public class SumOfDigitsOfANumber {

    /**
     * Given a number n,
     * write a function to return the sum of digits
     * of the number.
     *
     * example: 1976
     *
     * sum of digits = 1+9+7+6 = 23
     *
     *
     *
     * n = 1976
     *
     * last_digit = n % 10 // 6
     * n = n/10 // 197
     *
     * last_digit = n % 10 // 7
     * n = n/10 // 19
     *
     */
    static int getSum(int n){
        int sum = 0;

        while(n != 0){
            int lastDigit = n % 10;
            n = n / 10;
            sum = sum + lastDigit;
        }

        return sum;
    }


    public static void main(String[] args) {
        getSum(1007);
    }
}
