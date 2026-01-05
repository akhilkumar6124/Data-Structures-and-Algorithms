public class SinglyLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node fristNode = new Node(3);
        Node SecoundNode = new Node(5);
        Node thridNode = new Node(7);
        Node fourthNode = new Node(11);

        fristNode.next = SecoundNode;
        SecoundNode.next = thridNode;
        thridNode.next = fourthNode;

        Node currentNode = fristNode;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
}
