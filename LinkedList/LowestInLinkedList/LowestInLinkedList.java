
public class LowestInLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node fristNode = new Node(83);
        Node SecoundNode = new Node(34);
        Node thridNode = new Node(57);
        Node fourthNode = new Node(13);

        fristNode.next = SecoundNode;
        SecoundNode.next = thridNode;
        thridNode.next = fourthNode;

        Node currentNode = fristNode;
        Node lowerNode = fristNode;
        while (currentNode != null) {
            if (lowerNode.data > currentNode.data) {
                lowerNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        System.out.println(lowerNode.data);
    }
}