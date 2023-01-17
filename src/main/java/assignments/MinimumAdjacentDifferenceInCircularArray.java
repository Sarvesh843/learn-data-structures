package assignments;

import java.util.Scanner;

public class MinimumAdjacentDifferenceInCircularArray {

    // https://my.newtonschool.co/playground/code/xg2g2vox6a97/

    /**
     *
     * Input: int[] arr
     * Output: int
     * */
    static int getMinimumAdjacentDifference(int[] arr){
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i=1; i<n ; i++){
            minDiff = Math.min(minDiff, Math.abs(arr[i]-arr[i-1]));
        }

        // check for 0 and n-1, as array is arranged in circular fashion
        minDiff = Math.min(minDiff, Math.abs(arr[0]-arr[n-1]));
        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(getMinimumAdjacentDifference(arr));
        }
    }


}
