package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAndValue {
    static int maxAND(int[] arr,int n){
        int max=0;
        for(int i=1;i<n;i++){
            max=Math.max(max,arr[i-1]&arr[i]);
        }
        return max;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(maxAND(arr,n));
        }
    }
}
