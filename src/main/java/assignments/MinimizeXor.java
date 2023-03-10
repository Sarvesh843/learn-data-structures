package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeXor {
    static long minimumXOR(long[] arr){
        long min=Long.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i-1]^arr[i]);
        }

        return min;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);

        System.out.print(minimumXOR(arr));
    }
}
