package assignments;

import java.util.Scanner;

public class RotateTheMatrix {

    /**
     * Input: int[][] , int n, int m
     * Output: int[][]
     */
    static int[][] rotateBy90(int[][] arr, int n, int m){
        int[][] rotatedArray = new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                rotatedArray[j][n-i-1] = arr[i][j];
            }
        }
        return rotatedArray;
    }

    static void printArray(int[][] arr, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] rotated90 =  rotateBy90(arr, n,n);
        printArray(rotated90, n, n);

        System.out.println();

        int[][] rotated180=  rotateBy90(rotated90,n,n);
        printArray(rotated180, n, n);
    }
}
