package assignments;

import java.util.Scanner;

public class StudentGrades {
    public StudentGrades() {
    }

    /**
     Step 1: Understand the input
     5 integers separated by spaces

     Step2: Output
     Output the grade "A","B","C","D"

     Step 3:
     This is how we obtain the percentage
     : ((a+b+c+d+e)/500.0 )*100

     Step 4:
     Thinking the logic:
     Percentage will be a double


     */


    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        double percentage = ((a+b+c+d+e)/500.0)*100;

        if(percentage >= 80){
            System.out.println("A");
        }
        else if(percentage<80 && percentage>=60){
            System.out.println("B");
        }
        else if(percentage<60 && percentage >=40){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }

    }
}
