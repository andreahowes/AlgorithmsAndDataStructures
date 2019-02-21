package linkedLists;

public class ReturnNthToLast {
    //algorithm to return the nth element of a singly linked list
    public static void main(String[] args) {
        Node1 firstNode = new Node1(1);
        firstNode.appendToTail(2);
        firstNode.appendToTail(3);
        firstNode.appendToTail(4);
        System.out.println(firstNode.findNth(3));

    }
}

//Node class to create linked list
class Node1 {
    //nodes connected
    private Node1 next = null;
    //Node1 previous = null;
    //information stored in node1
    private Integer data;

    //constructor to use in appendToTail method
    public Node1(Integer data) {
        this.data = data;
    }

    void appendToTail(Integer data) {
        Node1 end = new Node1(data);
        Node1 n = this;
        //going through the entire linked list to add at the end
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    //method to find nth element of linked list
    //use on any node in linked list
    public Integer findNth(int nth) {
        Node1 n = this;
        for (int i = 0; i <( nth-1); i++) {
            n = n.next;

        }
        return n.data;
    }
}

