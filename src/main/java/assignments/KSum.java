package assignments;

import java.util.Scanner;

public class KSum {

    static long getDividedSum(int[] arr, int m){
        long sum = 0;

        for(int el : arr){
            sum = sum + (long)Math.ceil(el * 1.0 / m);
        }
        return sum;
    }

    static int getMaxValue(int[] arr){
        int max = arr[0];

        for(int el: arr){
            max = Math.max(max, el);
        }
        return max;
    }

    static int bs(int[] arr, int k){
        int low =1;
        int high = getMaxValue(arr)+1;

        while (low < high){
            int mid = (low+high)/2;

            long curSum = getDividedSum(arr, mid);

            if( curSum <= k){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(bs(arr, k));
    }
}
