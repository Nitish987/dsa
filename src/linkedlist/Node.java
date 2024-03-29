package linkedlist;

public class Node {
    public int data;
    public Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
