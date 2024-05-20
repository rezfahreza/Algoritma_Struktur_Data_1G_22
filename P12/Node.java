package P12;

public class Node {
    int data;
    Node prev, next;

    public Node(Node prev, int data, Node next){
        this.next = prev;
        this.data = data;
        this.next = next;
    }
}
