package assignments;

import java.util.Scanner;

public class MinCutTree {

    static int getMaxFromArray(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    /**
     * Function to tell us the amount of wood
     * which will be collected
     *
     *  n = 10^5
     *
     *  arr[i] = 10^5
     *
     *  Suppose each element is 10^5
     *
     *         maxAmountOfWood = 10^5 * 10^5 = 10^10
     *
     *         Hence output should be of long
     *
     * Input: int[] arr, int x
     * Output: long
     */
    static long getCollectedWood(int[] arr, int x){
        long collectedWood = 0;
        for(int i=0; i<arr.length; i++){
            collectedWood = collectedWood+
                    Math.max(0, arr[i] - x);
        }
        return collectedWood;
    }

    static int binarySearch(int[] arr, int k){
        int low = 1;
        int high = getMaxFromArray(arr);

        while(low <= high){
            int mid = (low+high)/2;
            long woodCollected =
                    getCollectedWood(arr, mid);

            if(woodCollected <= k){
                high = mid-1;
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
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(arr, k));
    }
}
