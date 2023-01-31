package core.basics.maths;

public class Sieve {

    static int[] sieveOfEratosthenes(int N)
    {
        int arr[] = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                for (int j = i * 2; j <= N; j += i) {
                    arr[j] = arr[j] + 1;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        return arr;
    }
}
