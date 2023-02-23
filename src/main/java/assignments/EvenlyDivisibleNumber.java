package assignments;

import java.util.*;

public class EvenlyDivisibleNumber {
    static int gcd(int a, int b){
        if( b == 0){
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }

    static int lcm(int a, int b){
        return (a*b)/ gcd(a,b);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;// 2

        for(int i=2; i<=n;i++){
            res = lcm(res, i);
        }

        System.out.println(res);

    }
}
