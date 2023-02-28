package assignments;

public class DeletionInDoublyLinkedList {
    public static Node deleteElement(Node head, int k) {
//enter your code here
        Node ptr1 = head, ptr2 = head;
        // move ptr2 k positions
        while (k-- != 0) {
            ptr2 = ptr2.next;
        }

        while (ptr2 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        if (ptr1 == null) {
            return ptr1;
        } else if (ptr1 == head) {
            // delete the root Node
            Node newHead = ptr1.next;
            if (ptr1.next != null) {
                ptr1.next.prev = null;
                ptr1.next = null;
            }

            return newHead;
        } else {
            ptr1.prev.next = ptr1.next;
            if (ptr1.next != null)
                ptr1.next.prev = ptr1.prev;
            ptr1.next = null;
            ptr1.prev = null;
            return head;
        }
    }

    static class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
}
