package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveDublicateInLinkedList {
    public static SingleLinkedNode removeDuplicates(SingleLinkedNode head)
    {
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(head.data);
        SingleLinkedNode newHead = singleLinkedNode;
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(singleLinkedNode.data, true);
        while (head != null) {
            if (!map.getOrDefault(head.data, false)) {
                singleLinkedNode.next = new SingleLinkedNode(head.data);
                singleLinkedNode = singleLinkedNode.next;
            }
            map.put(head.data, true);
            head = head.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        SingleLinkedNode head = new SingleLinkedNode(7);
        head.next = new SingleLinkedNode(7);
        head.next.next = new SingleLinkedNode(1);
        head.next.next.next = new SingleLinkedNode(6);
        head.next.next.next.next = new SingleLinkedNode(10);
        head.next.next.next.next.next = new SingleLinkedNode(2);
        head.next.next.next.next.next.next = new SingleLinkedNode(7);
        head.next.next.next.next.next.next.next = new SingleLinkedNode(4);
        head.next.next.next.next.next.next.next.next = new SingleLinkedNode(7);
        head.next.next.next.next.next.next.next.next.next = new SingleLinkedNode(6);
//        linkedlist.Node head = new linkedlist.Node(2);
//        head.next = new linkedlist.Node(2);
//        head.next.next = new linkedlist.Node(2);
//        head.next.next.next = new linkedlist.Node(2);
//        head.next.next.next.next = new linkedlist.Node(2);
        SingleLinkedNode.print(head);
        SingleLinkedNode.print(removeDuplicates(head));
    }
}
