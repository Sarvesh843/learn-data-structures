package assignments;

public class DeleteEvenNodesFromTheList {
    static Node deleteEven(Node head){
//Enter your code here
        // dummy head
        Node dummyHead = new Node(-1);
        Node ptr1 = head.next;
        Node ptr2 = dummyHead;
        ptr2.next = head;
        head.next = null;

        while(ptr1 != null){

            if(ptr1.data % 2 == 1){
                ptr2.next = ptr1;
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
                ptr2.next = null;

            }
            else{
                ptr1 = ptr1.next;
            }
        }

        ptr2.next = dummyHead.next;
        return dummyHead.next;
    }

    static class Node {
        Node next;
        int data;

        Node(int val) {
            this.data = val;
            next = null;
        }
    }
}
