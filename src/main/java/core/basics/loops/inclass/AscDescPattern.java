package core.basics.loops.inclass;

import java.util.Scanner;

public class AscDescPattern {
    /**
     * Take an integer n as input.
     * And print the following pattern
     *
     * example: n = 5
     * 1 2 3 4 5 4 3 2 1
     *
     * n = 7
     * 1 2 3 4 5 6 7 6 5 4 3 2 1
     */
    static void printAsc(int n){
        for (int i=1; i <= n ; i++){
            System.out.print(i+" ");
        }
    }

    static void printDesc(int n){
        for(int i= n ; i>= 1; i--){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printAsc(n);
        printDesc(n-1);
    }
}
