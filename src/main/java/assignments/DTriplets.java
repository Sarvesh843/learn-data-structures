package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DTriplets {

    static long getTriplets(long[] arr, long p){

        Arrays.sort(arr);

        long count = 0;
        for(int i=0; i < arr.length; i++){
            long maxPossibleValue = p + arr[i];
            int j = bs(arr, maxPossibleValue,
                    i+1, arr.length-1);


            long countElements = j-i;
            if(countElements >= 2){
                count =count + (countElements*(countElements-1))/2;
            }
        }
        return  count;
    }

    static int bs(long[] arr, long el ,int low, int high){

        while( low <= high){
            int mid = (low+high)/2;
            if( arr[mid] > el){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = sc.nextLong();
        long[] arr= new long[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }

        System.out.println(getTriplets(arr, p));
    }
}
