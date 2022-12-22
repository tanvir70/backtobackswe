package swe;

public class EvenOddPartition extends DLL {

    public Node oddEvenPartition(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node even = head;
        Node odd = head.next;
        Node oddHead = odd;

        while (odd != null && odd.next != null) {
            even.next = odd.next;
            even = odd.next;
            odd.next = even.next;
            odd = even.next;
        }
        even.next = oddHead;

        return head;
    }


    public static void main(String[] args) {
        EvenOddPartition ob = new EvenOddPartition();
        ob.addFirst("list");
        ob.addFirst("link");
        ob.addFirst("a");
        ob.addFirst("is");
        ob.addFirst("This");
        ob.addLast("test");
        ob.printTheLinkedList();

        ob.oddEvenPartition(ob.head);
        System.out.println();
        ob.printTheLinkedList();
    }
}
