public class DoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void displayForward() {
        System.out.print("Forward: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void displayBackward() {
        System.out.print("Backward: ");
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.displayForward();
        list.displayBackward();
    }
}