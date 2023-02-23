package assignments;

import java.util.Scanner;

public class CleanTheRoom {

    static int getMaxSimilarRowCount(String[] arr){
        int maxCount = 1;

        for(int i=0; i< arr.length; i++){
            int count = 1;
            for(int j=i+1; j< arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.next();
        }
        System.out.println(getMaxSimilarRowCount(arr));
    }
}
