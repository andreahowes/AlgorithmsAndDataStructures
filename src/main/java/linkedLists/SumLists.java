package linkedLists;


public class SumLists {
    
    public static void main(String[] args) {
        //given two linked lists of varying lengths, add the numbers at each points (first node being smallest integer) and return that new list
        Node4 node = new Node4(3);
        node.append(3);
        node.append(4);

        Node4 node2 = new Node4(1);
        node2.append(3);
        node2.append(2);

        Node4 sum = Node4.sumList(node, node2);

        while(sum.next != null) {
            System.out.println(sum.data);
            sum = sum.next;
        }
    }
    
}

class Node4 {
    Integer data;
    Node4 next = null;

    public Node4(Integer data) {
        this.data = data;
    }

    public void append(Integer data) {
        Node4 current = this;
        Node4 ending = new Node4(data);
        while(current.next != null) {
            current = current.next;
        }
        current.next = ending;
    }

    public static Node4 sumList(Node4 first, Node4 second) {
        Node4 sum = new Node4(first.data + second.data);
        Integer result;
        boolean carryOver = false;

        while(first != null && second != null) {
            if (first.next != null) {
                first = first.next;
            }
            if (second.next != null) {
                second = second.next;
            }
            if(first == null) {
                result = second.data;
            } else if (second == null) {
                result = first.data;
            } else {
                result = first.data + second.data;
            }
            if(carryOver) {
                result++;
                carryOver = false;
            }
            if(result >=10) {
                result = result-10;
                carryOver = true;
            }
            sum.append(result);
        }
        return sum;
    }
}
