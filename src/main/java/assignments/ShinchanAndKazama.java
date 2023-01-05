package assignments;

import java.util.Scanner;

public class ShinchanAndKazama {
    // https://my.newtonschool.co/playground/code/oseqvr38vczr/
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int S = sc.nextInt();

        int D = B-A;

        if( D < 0){
            // Distance cannot be negative
            D = -D;
        }


        int time = D/S;
        System.out.print(time);


    }
}
