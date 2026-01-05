public class DoublyLinkedList{
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args){
        Node fristNode = new Node(3);
        Node secoundNode = new Node(6);
        Node thridNode = new Node(9);
        Node fourthNode = new Node(12);

        fristNode.next = secoundNode;
        secoundNode.next = thridNode;
        thridNode.next = fourthNode;

        fourthNode.prev = thridNode;
        thridNode.prev = secoundNode;
        secoundNode.prev = fristNode;

        Node currentNode = fristNode;
        System.out.println("Forward");
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
        currentNode = fourthNode;
        System.out.println("Backward");
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.prev;
        }
    }
}