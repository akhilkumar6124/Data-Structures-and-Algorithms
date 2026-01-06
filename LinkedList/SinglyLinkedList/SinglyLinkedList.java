public class SinglyLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(8);
        head.next.next = new Node(11);
        head.next.next.next = new Node(32);

        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
}
