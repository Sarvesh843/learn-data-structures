package assignments;

import java.util.Scanner;

public class FindIt {
    static long binarySearch(long K){
        long low=1;
        long high=Integer.MAX_VALUE;
        while(low<=high){
            long mid=(low+high)/2;
            long x=(mid*mid)+(3*mid);
            if(x==K){
                return mid;
            }else if(x>K){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long K=sc.nextLong();
        System.out.println(binarySearch(K));
    }
}
