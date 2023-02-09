package assignments;

import java.util.Scanner;

public class SumOfCubes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        if(sumOfCube(n)){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }

    /**
     a^3 + b^3 = n

     a = 1
     b= cube root of n


     */

    public static boolean sumOfCube(long n){
        long low=1, high=(int)Math.cbrt(n);

        while(low<=high){
            long current=(low*low*low)+(high*high*high);

            if(current==n){
                return true;
            }else if(current<n){
                low++;
            }else{
                high--;
            }
        }
        return false;
    }
}
