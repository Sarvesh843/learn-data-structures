package assignments;

import java.util.Scanner;

public class SimpleDeterminant {

    /**
        n*m matrix how many elements

        2*2 matrix, how many elements = 4

        |a   b|
        |c  d|

        determinant= a*d - b*c
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =2;
        int m =2;
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int determinant = arr[0][0]* arr[1][1] - arr[0][1]*arr[1][0];
        System.out.println(determinant);

    }
}
