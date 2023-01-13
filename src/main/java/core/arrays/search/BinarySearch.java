package core.arrays.search;

public class BinarySearch {
    /**
     * Input: int[] arr, int el
     * Output: int
     */
    static int binarySearch(int[] arr, int el){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == el){
                return mid;
            }
            else if(arr[mid] < el){
                // el will lie towards
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,50};
        System.out.println(binarySearch(arr, 20));
    }

}
