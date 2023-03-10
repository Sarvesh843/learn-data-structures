package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithEqualOnesAndZeros {

    static long getSubarrayCount(int[] arr){
        // convert all 0s to -1s.
        for(int i=0; i < arr.length; i++){
            if(arr[i]==0){
                arr[i] = -1;
            }
        }

        // Problem boils down to finding number of
        // subarrays with sum 0

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,0);

        int sum =0;
        long ans = 0;

        for(int i=0; i< arr.length; i++){
            sum += arr[i];

            if(hm.containsKey(sum)){
                ans += hm.get(sum) + 1;

                hm.put(sum, hm.get(sum)+1);
            }
            else{
                hm.put(sum, 0);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getSubarrayCount(arr));
    }
}
