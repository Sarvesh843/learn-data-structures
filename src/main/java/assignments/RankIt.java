package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class RankIt {

    // https://www.geeksforgeeks.org/next-permutation/

    static int getRank(String s){
        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        int permCount = 1;

        while(!s.equals(new String(arr))){
            permCount++;
            generateNextPermutation(arr);
        }

        return permCount;
    }

    static void generateNextPermutation(char[] arr){
        int index = findSmallerAdjacentIndex(arr);


        if( index != -1){
            int justGreaterElementIndex =
                    findJustLargerElementIndex(arr, index+1, arr[index]);

            swap(arr, index, justGreaterElementIndex);

            Arrays.sort(arr,
                    index+1,
                    arr.length);
        }

    }

    static void swap(char[] arr , int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     *
     * Finds the index of element smaller than adjacent element
     */
    static int findSmallerAdjacentIndex(char[] arr){
        for(int i = arr.length-2; i>=0 ; i--){
            if(arr[i] < arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    static int findJustLargerElementIndex(char[] arr, int startIndex, int el){
        int largerElement = Integer.MAX_VALUE;
        int largerIndex = -1;

        for(int i = startIndex; i < arr.length; i++){
            if( arr[i] > el && arr[i] < largerElement){
                largerElement = arr[i];
                largerIndex = i;
            }
        }

        return largerIndex;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getRank(s));
    }
}
