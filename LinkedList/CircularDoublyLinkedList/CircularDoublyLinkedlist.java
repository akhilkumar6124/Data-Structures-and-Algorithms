public class CircularDoublyLinkedlist {
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        head.prev = newNode;
        tail = newNode;
    }
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Forward: ");
        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Backward: ");
        Node current = tail;
        do {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        } while (current != tail);
        System.out.println("(back to tail)");
    }
    public static void main(String[] args) {
        CircularDoublyLinkedlist list = new CircularDoublyLinkedlist();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.displayForward();
        list.displayBackward();
    }
}