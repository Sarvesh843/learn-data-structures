package core.basics.arrays;

public class SubarraySum {

    /**
     *  Given an array, write a function
     *  to return the sum of this array
     *  between startIndex and endIndex
     *  (both inclusive).
     *
     *      * example:
     *      * 0  1 2 3 4 5
     *      * [1 3 4 5 6 7]
     *      * 2
     *      * 5
     *      *
     *      * Output:
     *      * 22
     *
     *  Input:  int[] , int, int
     *  Output: int
     */
    static int getSubarraySum(int[] arr,
                              int startIndex,
                              int endIndex){
        int sum = 0;
        for(int i=startIndex; i<= endIndex; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
