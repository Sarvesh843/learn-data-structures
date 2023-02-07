package assignments;

public class PrintAllSubarrays {
    static void PrintSubarrays(int Arr[], int N){
        for(int i=0; i< Arr.length; i++){
            for(int j=i; j< Arr.length; j++){
                printSubarray(Arr, i, j);
                System.out.println();
            }
        }
    }

    // Function to print a subarray
    static void printSubarray(int[] arr, int start, int end){
        for(int i= start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
