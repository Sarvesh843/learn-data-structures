package assignments;

public class InsertNodeAtHeadInDoublyLinkedList {
    public static Node insertnew(Node head,int k) {
        Node temp = new Node(k);
        if(head == null){
            return temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            return temp;
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
