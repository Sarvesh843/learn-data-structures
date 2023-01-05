package assignments;

import java.util.Scanner;

public class LeapYear {
    /**
     Step 1: Look at the input
     Year (int)

     Step 2: Look at output:
     If year is a leap year or not
     if(year is leap year) print "YES"
     else (otherwise) print "NO"

     Step 3: Try to solve it on your own
     Condition for leap year
     c1 : Multiple of 4

     c2: if (multiple of 100) then should be multiple of 400

     100 ->



     c1: true
     but
     c2: false

     then it will not be a leap year.

     // Start with this assumption that year is not a leap year
     isLeapYear = false;

     // Checking if year is a multiple of 4
     if(year % 4 == 0){
     isLeapYear = true;
     }

     // Check if year is a multiple of 100
     if(year%100 == 0 && year%400 != 0){
     isLeapYear = false;
     }
     */


    public static void main (String[] args) {
        // Your code here

        //  Input
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // Start with the assumption that year is
        // not a leap year
        boolean isLeapYear = false;

        // Checking if year is a multiple of 4
        if(year % 4 == 0){
            isLeapYear = true;
        }

        // Check if year is a multiple of 100
        // then it should be multiple of 400.
        if(year%100 == 0 && year%400 != 0){
            isLeapYear = false;
        }

        if(isLeapYear){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
