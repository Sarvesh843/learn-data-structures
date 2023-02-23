package assignments;

public class SearchingAnElementInSortedArray {
    static int isPresent(long arr[], int n, long k)
    {
        // Your code here
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid] == k){
                return 1;
            }
            else if(arr[mid] > k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }
}
