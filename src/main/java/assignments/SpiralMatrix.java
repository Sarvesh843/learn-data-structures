package assignments;

import java.util.Scanner;

public class SpiralMatrix {

    static void leftToRight(int[][] arr,int start, int end, int row){
        for(int i=start; i<=end;i++){
            System.out.print(arr[row][i]+" ");
        }
    }

    static void topToDown(int[][] arr,
                          int start, int end, int col){
        for(int i=start; i<=end; i++){
            System.out.print(arr[i][col]+" ");
        }
    }

    static void rightToLeft(int[][] arr,int end, int start, int row){
        for(int i=end; i>=start;i--){
            System.out.print(arr[row][i]+" ");
        }
    }

    static void downToTop(int[][] arr,
                          int end, int start, int col){
        for(int i=end; i>=start; i--){
            System.out.print(arr[i][col]+" ");
        }
    }

    static void spiralOrder(int[][] arr, int n, int m){
        int left =0;
        int right = m-1;
        int top = 0;
        int down = n-1;

        while (left<=right && top<=down){
            // left to right traversal
            leftToRight(arr, left, right, top);
            top++;

            if(top > down){
                break;
            }

            // top to down traversal
            topToDown(arr, top, down, right);
            right--;

            if(left > right){
                break;
            }

            // right to left
            rightToLeft(arr, right, left, down);
            down--;
            if(top > down){
                break;
            }

            // down to top
            downToTop(arr, down, top, left);
            left++;

            if(left > right){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        spiralOrder(arr, n, m);
    }

}
