package core.arrays.sorting;

public class QuickSelect {

    /**
     * Write a program to find the kth
     * smallest element in an unsorted array.
     */
    static int kthSmallestElement(int[] arr, int k){
        return kthSmallestElementUtil(arr, k, 0, arr.length-1);
    }

    static int kthSmallestElementUtil(int[] arr,
                                      int k,
                                      int low,
                                      int high){
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

        if(curIndex == k-1){
            return arr[curIndex];
        }
        else if(curIndex > k-1){
            // answer lies towards left
            return  kthSmallestElementUtil(arr, k,
                    low, curIndex-1);
        }
        else{
            // answer lies towards right
            return  kthSmallestElementUtil(arr, k,
                    curIndex+1, high);
        }

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr= new int[]{7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallestElement(arr, 3));
    }

}
