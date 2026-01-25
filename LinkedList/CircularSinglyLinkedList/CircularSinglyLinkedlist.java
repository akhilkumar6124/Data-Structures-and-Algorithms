public class CircularSinglyLinkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
        CircularSinglyLinkedlist list = new CircularSinglyLinkedlist();
        list.insert(4);
        list.insert(8);
        list.insert(12);
        list.insert(16);
        list.display();
    }
}