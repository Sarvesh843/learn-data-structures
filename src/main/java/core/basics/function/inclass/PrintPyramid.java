package core.basics.function.inclass;

import java.util.Scanner;

public class PrintPyramid {
    /**
     * Given an integer n as input, print the following
     *
     *
     * n = 5
     * 1        // i=1
     * 1 2      // i=2
     * 1 2 3    // i=3
     * 1 2 3 4  // i=4
     * 1 2 3 4 5 // i = 5
     *
     */
    static void printAsc(int n){
        for (int i=1; i <= n ; i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =1 ; i <= n ; i++){
            printAsc(i);
            System.out.println();
        }
    }
}
