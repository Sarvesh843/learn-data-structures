package leetcode;

import java.util.*;

public class NextGreaterElement {
    // https://leetcode.com/problems/next-greater-element-i/description/

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        /**
         nums2 =  [1,3,4,2]

         next = [3,4,-1,-1]

         {
         1-> 3
         3 -> 4
         4 -> -1
         2-> -1
         }
         */
        int[] next = computeNextGreaterElement(nums2);

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i < nums2.length; i++){
            hm.put(nums2[i], next[i]);
        }

        int[] ans = new int[nums1.length];

        for(int i=0; i< nums1.length; i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }

    private int[] computeNextGreaterElement(int[] arr){
        int[] next = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){

            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                next[i] = -1;
            }
            else{
                next[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return next;
    }
}
