package core.basics.linkedlist;

public class LinkedList {

    // Add a node and return the head of the linked list
    static Node addFirst(Node head, int data){
        Node temp = new Node(data);

        if(head == null){
            return temp;
        }
        else{
            temp.next = head;
            return temp;
        }
    }

    static Node addLast(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        else{
            Node ptr = head;

            while(ptr.next != null){
                ptr = ptr.next;
            }

            ptr.next = temp;

            return head;
        }
    }

    // Removes the node and returns the head
    static Node removeNode(Node head, Node node){
        if(node == head){
            head = head.next;
            node.next = null;
        }
        else{
            // Find One node previous to node
            Node ptr = head;

            while( ptr.next != node){
                ptr = ptr.next;
            }

            ptr.next = node.next;
            node.next = null;
        }
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
