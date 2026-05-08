package Collection.LinkedList;

public class CreationLinkedList {

    // node creation
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // step 1 = create new node
        Node newNode = new Node(data);

        if (head == null) { // LL is empty
            head = tail = newNode;
            return;
        }

        // step 2 => newNode next = head
        newNode.next = head; // link

        // step 3 => head = newNode
        head = newNode;
    }

    public void addlast(int data) {

        // step 1 = create new node
        Node newNode = new Node(data);

        if (head == null) { // LL is empty
            head = tail = newNode;
            return;
        }

        // step 2 => tail next = newNode
        tail.next = newNode;

        // step 3 => tail = newNode
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {

        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;

    }

    // display LL
    public void display() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        CreationLinkedList ll = new CreationLinkedList();

        ll.display();
        ll.addFirst(2);
        ll.display();
        ll.addFirst(1);
        ll.display();
        ll.addlast(3);
        ll.display();
        ll.addlast(4);
        ll.display();
    }
}