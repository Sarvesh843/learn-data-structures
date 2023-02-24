package assignments;

public class CircularLinkedList {
    public static int check(Node head) {
//enter your code here
        Node ptr = head.next;

        while( ptr != null){

            if(ptr == head){
                return 1;
            }

            ptr = ptr.next;
        }

        return 0;
    }

    static class Node{
        int val;
        Node next;
    }
}
