package assignments;

import java.util.Scanner;

public class MaxComplement {
    static int MaxProduct(int arr[]){
        int pt1=0;
        int pt2 = arr.length -1;
        int maxProduct = Integer.MIN_VALUE;
        while(pt1<pt2){
            int product = arr[pt1]*arr[pt2];
            maxProduct = Math.max(maxProduct, product);
            pt1++;
            pt2--;
        }
        return maxProduct;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(MaxProduct(arr));

    }
}
