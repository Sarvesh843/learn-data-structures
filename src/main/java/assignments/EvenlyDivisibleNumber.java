package assignments;

import java.util.*;

public class EvenlyDivisibleNumber {
    static long gcd(long a, long b){
        if( b == 0){
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }

    static long lcm(long a, long b){
        return (a*b)/ gcd(a,b);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;// 2

        for(long i=2; i<=n;i++){
            res = lcm(res, i);
        }

        System.out.println(res);

    }
}
