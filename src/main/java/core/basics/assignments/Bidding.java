package core.basics.assignments;

import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int p=1; p <= t ; p++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A > B && A > C){
                System.out.println("Alice");
            }
            else if( B > A && B > C){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }
        }

    }
}
