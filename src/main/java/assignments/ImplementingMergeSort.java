package assignments;

public class ImplementingMergeSort {
    public static int[] implementMergeSort(int arr[], int start, int end)
    {
        mergeSortUtil(arr, start, end);
        return arr;
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
}
