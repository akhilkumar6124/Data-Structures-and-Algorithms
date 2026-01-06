class Stack{
    char stack[];
    int top;
    int size;
     public Stack(int size){
        this.size = size;
        this.top = -1;
        this.stack = new char[size];
    }
    public void push(char data){
        if(top==size-1){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = data;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return ' ';
        }
        return stack[top--];
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return ' ';
        }
        return stack[top];
    }
    public int size(){
        return top+1;
    }
    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push('A');
        stack.push('D');
        stack.push('O');
        stack.push('E');
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.printStack();
    }
}