package core.arrays.sorting;

public class BubbleSort {

    /**
     * Input: int[]
     * Output: void
     */
    static void bubbleSort(int[] arr){

        for(int lastIndex = arr.length ; lastIndex > 0 ; lastIndex--){
                int i =0;
                int j = i+1;

                while(j < lastIndex){
                    if(arr[i] > arr[j]){
                        // swap the elements
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }


                    i++;
                    j++;
                }
        }
    }


}
