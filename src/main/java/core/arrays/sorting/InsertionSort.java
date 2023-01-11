package core.arrays.sorting;

public class InsertionSort {
    /**
     * Input: int[]
     * Output: void
     */
    static void insertionSort(int[] arr){
        for(int i=0; i< arr.length ; i++){
            int j = 0;
            int k = i;
            int temp = arr[i];

            // We find the index for insertion
            while(j < i && arr[j] < temp){
                j++;
            }

            // Move elements back by 1 position
            while(k!=j){
                arr[k] = arr[k-1];
                k--;
            }

            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,10,12,1,5,6};
        insertionSort(arr);
    }

}
