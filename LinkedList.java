
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) { // O(n)
        //step1 = create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // note that LinkedList is the name of the file so direclty the name if the class of this file. noticce okay!
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
