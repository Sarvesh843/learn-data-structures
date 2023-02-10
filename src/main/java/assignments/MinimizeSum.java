package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeSum {
    static long getMinimumSum(int[] arr, int k){

        Arrays.sort(arr);

        int ptr2 = arr.length-1;
        while(ptr2 >=0 && arr[ptr2]  > 0 && k > 0){
            arr[ptr2] = -arr[ptr2];
            ptr2--;
            k--;
        }

        long sum = 0;
        for(int el: arr){
            sum +=el;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(getMinimumSum(arr, k));
    }
}
