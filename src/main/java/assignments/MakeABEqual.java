package assignments;

import java.util.Scanner;

public class MakeABEqual {
    //https://my.newtonschool.co/playground/code/x3z56q2iazs9/

    /**
     1 1 0 0 A
     0 1 1 1 B

     Each operation carries 1 cost.

     Convert A to B just by using the first operation:
     op1 = 1 + 1 + 1 = 3


     Rearrange:
     A -> 0 0 1 1
     B->  0 1 1 1

     op2 = 1 + 1 = 2
     = 1+ abs(countOnesInA - countOnesInB)

     minCost = Math.min(op2, op1);
     */

    /**
     * Input: int[] a, int[] b
     * Output: int
     */
    static int getSteps(int[] a, int[] b){
        int countOnesInA = 0;
        int countOnesInB = 0;
        int op1 = 0;
        int op2 = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                op1++;
            }

            countOnesInA = countOnesInA + a[i];
            countOnesInB = countOnesInB + b[i];
        }

        op2 = 1 + Math.abs(countOnesInB-countOnesInA);

        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n;i++) {
            a[i] =  sc.nextInt();
        }

        for(int i=0; i<n;i++) {
            b[i] =  sc.nextInt();
        }

        System.out.println(getSteps(a,b));
    }
}
