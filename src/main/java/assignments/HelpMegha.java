package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class HelpMegha {
    /***
     *  0 1 2 3 4 5 6 7 8 9 10
     *  F F T T F T F T F F F
     *  0 0 1 2 2 3 3 4 4 4 4
     *  count = 1-> 2
     *  N = 5 Output= 3
     *
     *  N = 8 Output: 4
     *
     *  Step 1: Compute Sieve
     *  Step 2: Find number of true values till N
     *
     * Approach 1: Use for loop to find all true.
     *  // O(n) for each n.
     *  // So for t values, O(n*t)
     *
     *  Approach 2: Store answer in integer array once,
     *  and then lookup the value.
     *
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Compute sieve for all values of N.
        boolean[] primes = sieveOfEratosthenes(100000);
        // Create a lookup table for this computed array.
        int[] countPrimes = countPrime(primes);

        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            System.out.println(countPrimes[n]);
        }
    }

    static int[] countPrime(boolean[] primes){
        int[] countPrimes = new int[primes.length];
        int count = 0;

        for(int i=0; i< primes.length; i++){
            if(primes[i]){
                count++;
            }
            countPrimes[i] = count;
        }

        return countPrimes;
    }

    static boolean[] sieveOfEratosthenes(int N)
    {
        boolean primes[] = new boolean[N + 1];
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for (int i = 2; i <= N; i++) {
            if (primes[i] == true) {
                for (int j = i * 2; j <= N; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
}
