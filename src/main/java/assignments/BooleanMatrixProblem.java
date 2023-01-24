package assignments;

import java.util.*;
import java.io.*;

public class BooleanMatrixProblem {

    /**
     * Check if given row contains 1
     *
     * Input: int[][] arr, int row, int m
     * Output: boolean
     */
    static boolean checkIfRowContainsOne(int[][] arr, int row, int m){
        for(int j=0; j<m; j++){
            if(arr[row][j] == 1)
                return true;
        }
        return false;
    }

    /**
     * Fill row with 1.
     * Input:  int[][] arr, int row, int m
     * Output: void
     */
    static void fillRowWithOne(int[][] arr, int row, int m){
        for(int j=0; j<m;j++) {
            arr[row][j] = 1;
        }
    }

    static void printArray(int[][] arr, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t= sc.nextInt();

        while (t-- != 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];

            for(int i=0; i<n;i++){
                for(int j=0; j<m;j++){
                    arr[i][j]  = sc.nextInt();
                }
            }

            for(int i=0; i<n;i++){
                if(checkIfRowContainsOne(arr, i, m)){
                    fillRowWithOne(arr,i,m);
                }
            }

            printArray(arr,n,m);
        }
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
