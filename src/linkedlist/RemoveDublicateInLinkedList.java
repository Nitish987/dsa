package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveDublicateInLinkedList {
    public static Node removeDuplicates(Node head)
    {
        Node node = new Node(head.data);
        Node newHead = node;
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(node.data, true);
        while (head != null) {
            if (!map.getOrDefault(head.data, false)) {
                node.next = new Node(head.data);
                node = node.next;
            }
            map.put(head.data, true);
            head = head.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(7);
        head.next.next = new Node(1);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next.next.next = new Node(6);
//        linkedlist.Node head = new linkedlist.Node(2);
//        head.next = new linkedlist.Node(2);
//        head.next.next = new linkedlist.Node(2);
//        head.next.next.next = new linkedlist.Node(2);
//        head.next.next.next.next = new linkedlist.Node(2);
        Node.print(head);
        Node.print(removeDuplicates(head));
    }
}
