package core.basics.loops.inclass;

import java.util.Scanner;

public class PrintNumbersInReverseWithInput {
    public static void main(String[] args) {
        /**
         * Write a program which takes an integer
         * n as input, and prints the numbers between
         * n n-1 n-2 n-3 ..... 1 on the same line
         * separated by space.
         */
        // TODO: Write code to input n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Initialize code for loop
        int i = n;

        // Write Loop with condition and update logic
        while( i >= 1){
            System.out.print(i +" ");
            i--;
        }
    }
}
