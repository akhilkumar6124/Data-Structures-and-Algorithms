class Node{
    char value;
    Node next;
    Node(char value){
        this.value = value;
        this.next = null;
    }
}
class Stack{
    private Node head;
    private int size;
    public Stack(){
        this.head = null;
        this.size = 0;
    }
    public void push(char element){
        Node newNode = new Node(element);
        if(head!=null){
            newNode.next = head;
        }
        head = newNode;
        size++;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public char pop(){
        if(isEmpty()){
            return ' ';
        }
        char popped = head.value;
        head = head.next;
        size--;
        return popped;
    }
    public char peek(){
        if(isEmpty()){
            return ' ';
        }
        return head.value;
    }
    public int size(){
        return size;
    }
}
public class StackLinkedList{
    public static void main(String[] args) {
        Stack myStack = new Stack();
        
        myStack.push('A');
        myStack.push('B');
        myStack.push('C');

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("Size: " + myStack.size());
    }
}