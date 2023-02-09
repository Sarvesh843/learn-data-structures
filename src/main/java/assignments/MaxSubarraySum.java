package assignments;

import java.util.Scanner;

public class MaxSubarraySum {

    static long maxSubarraySum(int[] arr, int k){
        long sum = 0;
        long maxSum =0;
        for(int i=0; i<k;i++){
            sum += arr[i];
        }

        maxSum= sum;

        int ptr1=0;
        int ptr2 = k-1;

        while(ptr2 + 1 < arr.length){
            ptr2++;
            ptr1++;

            sum += arr[ptr2] - arr[ptr1-1];

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubarraySum(arr, k));
    }

}
