package assignments;

public class MakeItCircular {
    public static Node MakeCircular(Node head) {
//enter your code here
        Node ptr = head;
        // go to the last node
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = head;
        return head;
    }

    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
}
