package assignments;

import java.util.Scanner;

public class ORCounting {

    static int ORValue(String a, String b){
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        return num1 | num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(ORValue(a,b));
    }
}
