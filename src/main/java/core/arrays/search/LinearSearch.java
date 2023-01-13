package core.arrays.search;

public class LinearSearch {
    /**
     * Write a function that takes an array
     * and an integer el as input,
     * and return the index of the position
     * if el exist in this array else
     * if el doesn't exist it returns -1.
     *
     *
     * Input: int[] arr, int target
     * Output: int
     */
    static int findElement(int[] arr, int target){

        for(int i=0; i< arr.length; i++){
            // O(n) times
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
