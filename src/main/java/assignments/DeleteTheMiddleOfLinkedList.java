package assignments;

public class DeleteTheMiddleOfLinkedList {
    public static Node deleteMiddleElement(Node head) {
        // return the head of the modified Linked List
        if( head.next == null){
            head.val = -1;
        }
        else{
            Node prev, slow, fast;
            prev = null;
            slow = head;
            fast = head;

            while(fast != null && fast.next != null){
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            prev.next = slow.next;
            slow.next = null;
        }

        return head;
    }

    static class Node{
        int val;
        Node next;

    }
}
