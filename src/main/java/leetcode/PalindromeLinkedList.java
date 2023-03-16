package leetcode;

import java.util.*;
public class PalindromeLinkedList {

    // https://leetcode.com/problems/palindrome-linked-list/description/

    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }

        ListNode middle = getMiddle(head);

        Stack<Integer> st = new Stack<>();

        while(middle!=null){
            st.push(middle.val);
            middle = middle.next;
        }


        ListNode ptr = head;

        while(!st.isEmpty()){
            if(ptr.val != st.pop()){
                return false;
            }

            ptr = ptr.next;
        }

        return true;

    }

    private ListNode getMiddle(ListNode head){
        ListNode ptr1 = head, ptr2 = head;

        while(ptr2!=null && ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }

        return ptr1;
    }

    class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
