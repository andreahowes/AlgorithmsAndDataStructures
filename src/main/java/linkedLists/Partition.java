package linkedLists;

public class Partition {
    public static void main(String[] args) {
        Node3 node = new Node3(1);
        node.addToEndOfLinkedList(8);
        node.addToEndOfLinkedList(8);
        node.addToEndOfLinkedList(1);
        node.addToEndOfLinkedList(2);
        node.addToEndOfLinkedList(11);

    
        node = Node3.partition(node, 5);
    
        while(node != null){
            System.out.println(node.data);
            node = node.nextNode;
        }
    }
}

class Node3 {
    public Integer data;
    public Node3 nextNode = null;

    public Node3(Integer data) {
        this.data = data;
    }

    void addToEndOfLinkedList(Integer data) {
        Node3 ending = new Node3(data);
        Node3 current = this;
        while(current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = ending;
    }

    static Node3 partition(Node3 startNode, Integer partition) {
        //cycle through linked list and add to head node or tail node based on relationship to partition
        Node3 head = startNode;
        Node3 tail = startNode;

        while(startNode != null) {
            Node3 next = startNode.nextNode; //needed because next will be replaced
            if (startNode.data < partition) {
                //insert startnode at head
                startNode.nextNode = head;
                head = startNode;
            } else {
                //insert node at tail
                tail.nextNode = startNode;
                tail = startNode;
            }
            //go to next node
            startNode = next;
        }
       tail.nextNode = null;
       return head;
    }
}