public class CircularSinglyLinkedlist{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node fristNode = new Node(4);
        Node secoundNode = new Node(8);
        Node thridNode = new Node(12);
        Node fourthNode = new Node(16);

        fristNode.next = secoundNode;
        secoundNode.next = thridNode;
        thridNode.next = fourthNode;
        fourthNode.next = fristNode;

        Node currentNode = fristNode;
        Node startNode = fristNode;

        System.out.print(currentNode.data+" ");
        currentNode = currentNode.next;

        while(currentNode!=startNode){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println("....");
    }
}