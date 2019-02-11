package stacksAndQueues;

import java.util.NoSuchElementException;

public class ImplementationOfQueue {
    //a queue is a data structure that uses a First-in/First-out ordering. Operations: add(item), reomve(), peek(), isEmpty().
//node object for each integer in queue
    public static class Node {
        private int data;
        private Node nextNode;
        //constructor for node
        public Node(int data) {
            this.data = data;
        }
    }
    //creating first and last nodes
    private Node firstNode;
    private Node lastNode;

    //method for adding to queue
    public void add(int data) {
        Node newNode = new Node(data);

        if (lastNode != null) {
            lastNode.nextNode = newNode;
        }
        lastNode = newNode;
        if (firstNode == null) {
            firstNode = lastNode;
        }
    }
    //removing from queue(only first object)
    public int remove(){
        if (firstNode == null){
            throw new NoSuchElementException();
        }
        int data = firstNode.data;
        firstNode = firstNode.nextNode;
        if(firstNode == null){
            lastNode = null;
        }
        return data;
    }

    //method to peek at first in queue
    public int peek(){
        if (firstNode == null){
            throw new NoSuchElementException();
        }
        return firstNode.data;
    }

    //method to see if queue is empty
    public boolean isEmpty(){
        return firstNode == null;

    }

}
