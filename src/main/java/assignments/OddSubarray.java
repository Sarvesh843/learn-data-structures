package assignments;

import java.util.*;
import java.io.*;

public class OddSubarray {
    // https://my.newtonschool.co/playground/code/3yqjzh52m9bh/

    /**
     * Input: int[] arr
     * Output: int
     */
    static int oddSubarrays(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 1){
                for(int j=i; j<arr.length && arr[j] % 2==1; j++){
                    count++;
                }
            }
        }
        return count;
    }

    // O(n)
    static long oddSubarraysApproach2(int[] arr){
        long count = 0;
        int i=0;
        while (i < arr.length){
                int j = i;
                while(j < arr.length && arr[j]%2==1){
                    j++;
                }
                int oddCount = j-i;
                count += getSubarrays(oddCount);
                i = j+1;
        }
        return count;
    }

    static long getSubarrays(long n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(oddSubarrays(arr));
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
