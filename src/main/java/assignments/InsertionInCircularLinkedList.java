package assignments;

public class InsertionInCircularLinkedList {
    public static Node Insertion(Node head, int K){
        Node newNode = new Node(K);

        // When the list is empty
        if(head==null){
            newNode.next = newNode;
            return newNode;
        }

        Node ptr = head;
        // Move to the end of the list
        while(ptr.next!=head){
            ptr = ptr.next;
        }

        ptr.next = newNode;
        newNode.next = head;

        return head;
    }

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }
}
