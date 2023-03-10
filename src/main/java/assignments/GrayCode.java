package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class GrayCode {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();
            System.out.println(greyCode(n));
        }
    }
    static long greyCode(long n) {
        return n ^ (n>>1);
    }
}
