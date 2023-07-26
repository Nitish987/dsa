public class ReverseLinkedListInGroup {
    public static Node reverse(Node node, int k) {
        boolean headFlag = true;
        Node head = null, end = null;
        while(node != null) {
            Node start = node, prev = null;
            int i = 0;
            while (node != null && i < k) {
                Node next = node.next;
                node.next = prev;
                prev = node;
                node = next;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        Node.print(head);
        Node newHead = reverse(head, 3);
        Node.print(newHead);
    }
}