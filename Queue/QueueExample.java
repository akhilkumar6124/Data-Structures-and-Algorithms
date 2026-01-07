public class QueueExample{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        q.printQueue();

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Peek: " + q.peek());
        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Size: " + q.size());

        q.printQueue();
    }
}
class Queue{
    char[] queue;
    int front;
    int size;
    int capacity;
    public Queue(int capacity){
        this.queue = new char[capacity];
        this.front = 0;
        this.size = 0;
        this.capacity = capacity;
    }
    public void enqueue(char element){
        if(size == capacity){
            System.out.println("Queue is Full...");
            return;
        }
        queue[(front + size)%capacity] = element;
        size++;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public char dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty...");
            return ' ';
        }
        char item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty...");
            return ' ';
        }
        return queue[front];
    }
    public int size(){
        return size;
    }
    public void printQueue(){
        System.out.println("Queue: ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%capacity]+" ");
        }
        System.out.println();
    }
}