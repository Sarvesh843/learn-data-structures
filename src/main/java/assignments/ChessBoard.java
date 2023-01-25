package assignments;

import java.util.*;
import java.io.*;

public class ChessBoard {
    /**
     * Input: int[][] arr, int row ,int startValue, int n
     * Output: int
     */
    static int stepsToMakeAlternateOrderRow(int[][] arr, int row,
                                            int startValue, int n){
        int steps=0;
        for(int i=0; i<n; i++){
            if(i%2==0 && arr[row][i]!=startValue){
               steps++;
            }
            else if(i%2!=0 && arr[row][i] != (startValue+1)%2){
                steps++;
            }
        }
        return steps;
    }

    static int stepsToMakeChessBoard(int[][] arr, int startValue, int n){
        int steps=0;
        for(int i=0; i<n;i++){
            if(i%2==0 ){
                steps = steps + stepsToMakeAlternateOrderRow(arr, i,
                        startValue, n);
            }
            else{
                steps = steps + stepsToMakeAlternateOrderRow(arr, i,
                        (startValue+1)%2, n);
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int startsAt0 = stepsToMakeChessBoard(arr,0,n);
        int startsAt1 = stepsToMakeChessBoard(arr,1,n);

        System.out.println(Math.min(startsAt0, startsAt1));
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
