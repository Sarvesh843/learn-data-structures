package core.arrays.sorting;

public class MergeSort {
    static void mergeSort(int[] arr){
        mergeSortUtil(arr, 0, arr.length-1);
    }

    static void mergeSortUtil(int[] arr, int low, int high){
        if(low == high){
            return;
        }

        int mid = (low + high)/2;

        mergeSortUtil(arr, low, mid);
        mergeSortUtil(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int index = 0;

        int ptr1 = low;
        int ptr2 = mid + 1;

        while( ptr1 <= mid && ptr2 <= high){

            if( arr[ptr1] <= arr[ptr2]){
                temp[index] = arr[ptr1];
                ptr1++;
            }
            else{
                temp[index] = arr[ptr2];
                ptr2++;
            }
            index++;
        }

        while( ptr1 <= mid){
            temp[index] =  arr[ptr1];
            index++;
            ptr1++;
        }

        while( ptr2 <= high){
            temp[index] =  arr[ptr2];
            index++;
            ptr2++;
        }

        // Copy back to the main array
        for(int i=0; i<temp.length; i++){
            arr[low + i] = temp[i];
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{38, 27, 43, 3, 9, 82, 10};

        printArray(arr);
        System.out.println();
        mergeSort(arr);
        printArray(arr);
    }
}
