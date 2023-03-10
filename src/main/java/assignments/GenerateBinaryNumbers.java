package assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {

    static void printBinaryNumbers(int n){
        Queue<String> q = new LinkedList<>();

        q.offer("1");

        while(Integer.parseInt(q.peek(),2) <= n){

            String binaryString = q.poll();
            q.offer(binaryString+"0");
            q.offer(binaryString+"1");

            System.out.print(binaryString+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printBinaryNumbers(n);
    }
}
