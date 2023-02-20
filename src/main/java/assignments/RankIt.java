package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class RankIt {

    static int getRank(String s){
        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        int permCount = 1;

        while(!s.equals(new String(arr))){
            permCount++;
            generateNextPermutation(arr);
            System.out.println(new String(arr));
        }

        return permCount;
    }

    static void generateNextPermutation(char[] arr){
        int index = findSmallerAdjacentIndex(arr);

        if( index != -1){
            Arrays.sort(arr,
                    index+1,
                    arr.length);


            swap(arr, index, arr.length-1);
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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getRank(s));
    }




}
