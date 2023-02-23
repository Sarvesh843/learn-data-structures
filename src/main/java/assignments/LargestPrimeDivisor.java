package assignments;
import java.util.*;

public class LargestPrimeDivisor {
    static int primeDivisor(int n,boolean[] primes){
        for(int i=n;i>=2;i--){
            if(primes[i]==true&&n%i==0){
                return i;
            }
        }
        return n;
    }
    static boolean[] sieveOfEratosthenes(int n){
        boolean[] primes=new boolean[n+1];
        Arrays.fill(primes,true);
        for(int p=2;p*p<=n;p++){
            if(primes[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    primes[i]=false;
                }
            }
        }
        return primes;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] primes=sieveOfEratosthenes(n);
        System.out.println(primeDivisor(n,primes));
    }
}
