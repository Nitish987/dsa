package linkedlist;

public class ReverseLinkedListInGroup {
    public static SingleLinkedNode reverse(SingleLinkedNode singleLinkedNode, int k) {
        boolean headFlag = true;
        SingleLinkedNode head = null, end = null;
        while(singleLinkedNode != null) {
            SingleLinkedNode start = singleLinkedNode, prev = null;
            int i = 0;
            while (singleLinkedNode != null && i < k) {
                SingleLinkedNode next = singleLinkedNode.next;
                singleLinkedNode.next = prev;
                prev = singleLinkedNode;
                singleLinkedNode = next;
                i++;
            }
            if (headFlag) {
                head = prev;
                headFlag = false;
            }
            if (end != null) {
                end.next = prev;
            }
            end = start;
        }
        return head;
    }

    public static void main(String[] args) {
        SingleLinkedNode head = new SingleLinkedNode(1);
        head.next = new SingleLinkedNode(2);
        head.next.next = new SingleLinkedNode(3);
        head.next.next.next = new SingleLinkedNode(4);
        head.next.next.next.next = new SingleLinkedNode(5);
        head.next.next.next.next.next = new SingleLinkedNode(6);
        head.next.next.next.next.next.next = new SingleLinkedNode(7);
        SingleLinkedNode.print(head);
        SingleLinkedNode newHead = reverse(head, 3);
        SingleLinkedNode.print(newHead);
    }
}