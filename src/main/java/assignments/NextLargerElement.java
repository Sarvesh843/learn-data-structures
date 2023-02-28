package assignments;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {

    static void nextLargerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for(int i= arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                ans.push(st.peek());
            }
            st.push(arr[i]);
        }

        while(!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        nextLargerElement(arr);
    }
}
