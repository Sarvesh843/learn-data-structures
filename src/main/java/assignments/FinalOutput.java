package assignments;

import java.util.Scanner;

public class FinalOutput {

    /**
     *
     *  (a*b)%m = ((a%m) * (b%m))%m
     */
    static long getArrayProduct(int[] arr){
        long product = 1;
        long mod= 1000000007;

        for(int i=0; i< arr.length; i++){
            product = (product%mod * arr[i]%mod)%mod;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getArrayProduct(arr));
    }
}
