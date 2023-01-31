package assignments;

import java.util.Scanner;

public class DivisorsOfN {

    static int getEvenDivisors(int n){
        int count = 0;

        for(int i=1; i<= (int)Math.sqrt(n); i++){
            if(n%i==0){
                int factor1=i;
                int factor2 = n/i;

                if(factor1%2 == 0)
                    count++;

                if(factor2%2==0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            System.out.println(getEvenDivisors(n));
        }
    }
}
