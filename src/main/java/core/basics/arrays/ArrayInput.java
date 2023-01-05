package core.basics.arrays;

import java.util.Scanner;

public class ArrayInput {

    /**
     * Given an integer n as input,
     * Followed by n space separated integers.
     *
     * Store these integers.
     *
     * Print these integers
     *
     * Print the size of the array.
     *
     * example:
     * n = 3
     * 1  2 3
     *
     * Output:
     * 1 2 3
     * 3
     *
     */

    static void printArray(int[] arr){

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        System.out.println(arr.length);
    }
}
