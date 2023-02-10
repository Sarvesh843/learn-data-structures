package core.arrays.sorting;

public class QuickSort {

    static int findPivotIndex(int[] arr, int low, int high){
        int pivotIndex = high;
        int curIndex = low;

        for(int i= low; i<= high; i++){
            if(arr[i] < arr[pivotIndex]){
                swap(arr, i, curIndex);
                curIndex++;
            }
        }
        // In the end
        swap(arr, curIndex, pivotIndex);
        return curIndex;
    }

    static void quickSort(int[] arr){
        quickSortUtil(arr, 0, arr.length-1);
    }

    static void quickSortUtil(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int pivotIndex = findPivotIndex(arr, low, high);
        quickSortUtil(arr, low, pivotIndex-1);
        quickSortUtil(arr, pivotIndex+1, high);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,9,21,1 ,3,2};
        quickSort(arr);
        printArray(arr);

    }

}
