package assignments;

import java.util.Scanner;

public class MaximumAndMinimumInAnArray {
    /**
     * Input: int[]
     * Output: int int
     */

    static int getMinimumFromArray(int[] arr){
        /**
         * arr = 9 5 11 3 2
         */
        int min = arr[0]; // 9

        for(int i=0; i<arr.length;i++){
            min = Math.min(min, arr[i]); // 2
        }
        return min;
    }
    // writing the function to get maximum value
    static int getMaximumFromArray(int[] arr){
        /**
         * arr = 9 5 11 3 2
         */
        int max = arr[0]; // 9

        for(int i=0; i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0 ; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int max = getMaximumFromArray(arr);
            int min = getMinimumFromArray(arr);

            System.out.println(max +" "+min);
        }

    }


}
