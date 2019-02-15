package linkedLists;

public class ReturnNthToLast {
    //algorithm to return the nth to last element of a singly linked list

//Node class to create linked list
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
        //method to find nth to last element of linked list
        public Integer findNth(int findNthToLast){

        }
    }
}
