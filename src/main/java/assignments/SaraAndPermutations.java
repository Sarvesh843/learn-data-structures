package assignments;

import java.io.*;
import java.util.*;

public class SaraAndPermutations {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String[] str2 = str1.split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str2[i]);
        }
        PermuteTheArray(arr, n);
    }





    static void PermuteTheArray(int A[], int n)
    {
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[A[i] - 1] = i;
        }

        int mini = n, maxi = 0;


        for(int i = 0; i < n; i++)
        {

            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);

            if (maxi - mini == i)

                System.out.print(1+" ");
            else
                System.out.print(0+" ");
        }
    }
}
