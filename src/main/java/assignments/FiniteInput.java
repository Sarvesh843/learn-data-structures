package assignments;

import java.util.Scanner;

public class FiniteInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            System.out.print(n+" ");

            if(n  == 0){
                break;
            }
        }
    }
}
