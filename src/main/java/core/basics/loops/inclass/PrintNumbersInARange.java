package core.basics.loops.inclass;

import java.util.Scanner;

public class PrintNumbersInARange {
    public static void main(String[] args) {
        /**
         * Given two integers a and b as input,
         * print numbers between a and b.
         * Assume a <=b.
         *
         * example:
         * Input:
         * 5
         * 10
         *
         * Output:
         * 5 6 7 8 9 10
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a;

        while(i <= b){
            System.out.print(i +" ");
            i++;
        }
    }
}
