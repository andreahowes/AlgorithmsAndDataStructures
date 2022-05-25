package linkedLists;



public class DeleteMiddleNode {
    public static void main(String args[]) {
        Node2 node = new Node2(1);
        node.addToEndOfLinkedList(2);
        node.addToEndOfLinkedList(3);
        node.addToEndOfLinkedList(4);
        node.addToEndOfLinkedList(5);
        node.deleteMiddleNode(3);

        while(node != null){
            System.out.println(node.data);
            node = node.nextNode;
        }
    }
}


class Node2 {
    public Integer data;
    public Node2 nextNode = null;

    public Node2(Integer data) {
        this.data = data;
    }

    void addToEndOfLinkedList(Integer data) {
        Node2 ending = new Node2(data);
        Node2 current = this;
        while(current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = ending;
    }

    void deleteMiddleNode(Integer positionToDelete) {
        Integer count = 0;
        Node2 current = this;
    
        //get to node to delete
        while(count<(positionToDelete-1) & current.nextNode != null) {
            current = current.nextNode;
            count++;
        }
        //delete current node
        Node2 next = current.nextNode;
        current.nextNode = next.nextNode;
    }

}