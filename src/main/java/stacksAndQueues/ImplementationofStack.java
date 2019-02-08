package stacksAndQueues;

import java.util.EmptyStackException;

public class ImplementationofStack {
    //a stack is a data structure that uses the Last-in = First-out ordering. Operations: pop(), push(item), peek(), isEmpty().

    //node object for each integer in stack
    private static class Node{
        private int data;
        private Node next;

        //constructor for node in stack
        public Node(int data) {
            this.data = data;
        }
    }

    //create the top of the stack
    private Node top;

    //methods for stack: pop, push, peek, isEmpty
    public int pop(){
        if (top==null) throw new EmptyStackException();
        int data = top.data;
        top=top.next;
        return data;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int peek(){
        if(top==null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
}
