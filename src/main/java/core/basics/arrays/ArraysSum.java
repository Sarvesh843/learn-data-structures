package core.basics.arrays;

public class ArraysSum {

    /**
     * Write a function which takes an integer array as input,
     * and returns the sum of elements in the array.
     *
     * example:
     * arr = [1,4,5,6]
     *        0 1 2 3
     *
     *
     * You should return 16
     *
     *
     * Input: int[]
     * Output: int
     * arr = [1,4,5,6]
     *        0 1 2 3
     *
     *  sum = 0
     *
     *  i =0
     *  sum = sum + 1; = 1
     *
     *  i = 1
     *  sum = sum +  4; = 5
     *
     *
     */
    static int getArraySum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Write a function which takes an integer array as input,
     * and returns the product of elements in the array.
     *
     * example:
     * arr = [1,4,5,6]
     *        0 1 2 3
     *
     *  Function should return 120
     */
    static int getArrayProduct(int[] arr){
        int prod = 1;
        for(int i=0; i< arr.length; i++){
            prod =  prod * arr[i];
        }
        return prod;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,6};
        System.out.println(getArraySum(arr));
        System.out.println(getArrayProduct(arr));
    }


}
