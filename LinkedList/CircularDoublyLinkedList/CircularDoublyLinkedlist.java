

public class CircularDoublyLinkedlist{
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
    public static void main(String[] args) {
        Node fristNode = new Node(5);
        Node secoundNode = new Node(10);
        Node thridNode = new Node(15);
        Node fourthNode = new Node(20);

        fristNode.next = secoundNode;
        secoundNode.next = thridNode;
        thridNode.next = fourthNode;
        fourthNode.next = fristNode;
        
        fristNode.prev = fourthNode;
        fourthNode.prev = thridNode;
        thridNode.prev = secoundNode;
        secoundNode.prev = fristNode;

        System.out.println("Forward");
        Node CurrentNode = fristNode;
        Node startNode = fristNode;
        System.out.print(CurrentNode.data+" ");
        CurrentNode = CurrentNode.next;
        while(CurrentNode!=startNode){
            System.out.print(CurrentNode.data+" ");
            CurrentNode = CurrentNode.next;
        }
        System.out.print("...");

        System.out.println();

        System.out.println("Backword");
        CurrentNode = fourthNode;
        startNode = fourthNode;
        System.out.print(CurrentNode.data+" ");
        CurrentNode = CurrentNode.prev;
        while(CurrentNode!=startNode){
            System.out.print(CurrentNode.data+" ");
            CurrentNode = CurrentNode.prev;
        }
        System.out.print("...");
    }
}