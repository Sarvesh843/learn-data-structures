package assignments;

public class LinkedListImplementationOfQueue {

    class Queue
    {
        private Node front, rear;
        private int currentSize;

        class Node {
            Node next;
            int val;

            Node(int val) {
                this.val = val;
                next = null;

            }
        }

        public Queue()
        {
            front = null;
            rear = null;
            currentSize = 0;
        }

        public boolean isEmpty()
        {
            return (currentSize <= 0);
        }

        public void dequeue()
        {

            if (isEmpty())
            {

            }
            else{
                front = front.next;
                currentSize--;
            }
        }

        //Add data to the end of the list.
        public void enqueue(int data)
        {
            Node oldRear = rear;
            rear = new Node(data);

            if (isEmpty())
            {
                front = rear;
            }
            else
            {
                oldRear.next = rear;
            }
            currentSize++;
        }

        public void displayfront(){
            if(isEmpty()){
                System.out.println("0");
            }
            else{
                System.out.println(front.val);
            }
        }
    }


}
