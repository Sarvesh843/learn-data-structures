package assignments;

import java.util.Scanner;

public class TargetDifference {

    /**
     * Input: int[] arr, int targetDiff
     * Output: boolean
     */
    static boolean doesTargetDiffExist(int[] arr,
                                       int targetDiff){

        for(int i=1; i < arr.length; i++) {
            int b = arr[i];
            int a = b - targetDiff;
            // check if a exist in the array till b
            if(binarySearch(arr, 0, i-1, a)!=-1){
                return true;
            }
        }
        return false;
    }

    static int binarySearch(int[] arr,
                            int low,
                            int high,
                            int el){
        while(low <= high){
            int mid = (low+high)/2;

            if( arr[mid] == el){
                return mid;
            }
            else if( arr[mid] > el){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int targetDiff = sc.nextInt();

        if(doesTargetDiffExist(arr, targetDiff)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
