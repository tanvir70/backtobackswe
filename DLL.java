package swe;

public class DLL {
    Node head;
    private int size;
    DLL(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while ( currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    // Print the list
    public void printTheLinkedList(){
        if ( head == null){
            System.out.println("The link list is empty");
            return;
        }
        Node currentNode = head;
        while ( currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print(" NULL");
    }
    // delete first
    public void deleteFirst(){
        if ( head == null){
            System.out.println("The link list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if ( head == null){
            System.out.println("The link list is empty");
            return;
        }
        size--;
        if ( head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void getSize(){
        System.out.println("\nThe size of the link list is : " + size);
    }
    public static void main(String[] args) {
        DLL ob = new DLL();
        ob.addFirst("a");
        ob.addFirst("is");
        ob.printTheLinkedList();
        System.out.println();
        ob.addFirst("this");
        ob.addLast("link");
        ob.addLast("List");
        ob.printTheLinkedList();
        ob.getSize();
    }
}
