package assignments;

import java.util.Scanner;

public class SubtractionWithoutArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long val = a ^ b;
        if(b > a){
            val = -val;
        }

        System.out.println(val);
    }
}
