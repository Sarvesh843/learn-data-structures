package assignments;

import java.util.Scanner;

public class LogicalOperators {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        boolean condition1 = ( a <= 10  && b >= 10);
        boolean condition2 = (a%2 == 0 || b%2 == 0);
        boolean condition3 = (a != b);

        System.out.println(condition1 + " "+ condition2 +" "+ condition3);

    }
}
