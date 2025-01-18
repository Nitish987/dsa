package linkedlist;

public class SingleLinkedNode {
    public int data;
    public SingleLinkedNode next;

    SingleLinkedNode(int data) {
        this.data = data;
        next = null;
    }

    public static void print(SingleLinkedNode head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
