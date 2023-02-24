package assignments;

public class ReverseLinkedList {
    public static Node ReverseLinkedList(Node head) {
        // return the head of the modified linked list
        Node prev = null, cur = head, next = null;

        while( cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }



    static class Node{
        int data;
        Node next;

    }
}
