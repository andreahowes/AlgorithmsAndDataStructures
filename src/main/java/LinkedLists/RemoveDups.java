package LinkedLists;
import java.util.HashSet;

public class RemoveDups {
    //Remove duplicates from an unsorted lined list.
    public static void main(String[] args) {
        Node startNode = new Node(1);
        //adding to linkedList
        startNode.appendToTail(2);
        startNode.appendToTail(3);
        startNode.appendToTail(1);
        startNode.appendToTail(2);

        //instance to use remove method
        RemoveDups removeDups = new RemoveDups();
        removeDups.remove(startNode);

    }
    private void remove(Node startNode) {
        //create emply hashset
        HashSet<Integer> set = new HashSet<>();

        // create previous node Integer;
        Node previous = null;

        //set current node to beginning of list

        Node currentNode = startNode;

        //if the hashset contains the node, set linkedlist previous node.next equal to current.next
        while (currentNode != null) {
            if(set.contains(currentNode.data)){
                previous.next = currentNode.next;
            } else{
                //otherwise, add current node to hashset and set previous node to n
                //and set n = n.next
              set.add(currentNode.data);
              previous = currentNode;
            }
            currentNode = currentNode.next;
        }
        //then print linkedList to see what it looks like
        Node printedNode = startNode;
        while(printedNode != null){
            System.out.println(printedNode.data);
            printedNode = printedNode.next;
        }


    }

}

class Node{
    //nodes connected
    Node next = null;
    //Node previous = null;
    //information stored in node
    Integer data;

    //constructor to use in appendToTail method
    public Node(Integer data) {
        this.data = data;
    }

    void appendToTail(Integer i){
        Node end = new Node(i);
        Node n = this;
        //going through the entire linked list to add at the end
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
