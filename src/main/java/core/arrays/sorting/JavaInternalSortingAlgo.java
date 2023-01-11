package core.arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class JavaInternalSortingAlgo {

    static void printArray(Integer[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr= new Integer[]{9,4,5,1,6,9,12,23,41};

        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
