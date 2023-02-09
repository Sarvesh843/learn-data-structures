package assignments;

import java.util.Scanner;

public class SumSubarray {

    static int minLengthSubarray(int[] arr, long k){
        int minLength = arr.length;
        int ptr1=0;
        int ptr2 = 0;
        long sum = 0;

        while(ptr2 < arr.length){
            sum += arr[ptr2];

            while(sum >= k && ptr1!=ptr2){
                minLength = Math.min
                        (minLength, ptr2-ptr1+1);
                sum -= arr[ptr1];
                ptr1++;
            }
            ptr2++;
        }
        return minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(minLengthSubarray(arr, k));
    }


}
