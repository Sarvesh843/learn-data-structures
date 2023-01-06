package core.basics.arrays;

public class PrintSubarray {

    /**
     * Given an array, write a function
     * to print the elements of this array
     * between startIndex and endIndex (both inclusive).
     *
     * example:
     * 0  1 2 3 4 5
     * [1 3 4 5 6 7]
     * 2
     * 5
     *
     * Output:
     * 4 5 6 7
     *
     * Input: int[]  , int , int
     * Output: void, because we just need to print the
     * elements of this array
     */
    static void printSubarray(int[] arr,
                              int startIndex,
                              int endIndex){

        for(int i= startIndex; i <= endIndex; i++){
            System.out.print(arr[i]);
        }
    }


}
