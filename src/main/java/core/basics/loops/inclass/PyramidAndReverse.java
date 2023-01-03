package core.basics.loops.inclass;

import java.util.Scanner;

public class PyramidAndReverse {
    /**
     * Given an integer n as input,
     *
     * Print the following pattern.
     *
     * example: n = 5
     *
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5  // n
     * 1 2 3 4  // n-1
     * 1 2 3   // n-2
     * 1 2 // ...
     * 1   // i = 1 for printAsc function
     */
    static void printAsc(int n){
        for (int i=1; i <= n ; i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Printing the first half
        for (int i =1 ; i <= n ; i++){
            printAsc(i);
            System.out.println();
        }

        for(int i=n-1; i>=1 ; i--){
            printAsc(i);
            System.out.println();
        }

    }
}
