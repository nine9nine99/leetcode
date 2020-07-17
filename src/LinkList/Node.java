package LinkList;

public class Node {
    public int data;
    public Node next;

    public Node(){
        this.data = 0;
        this.next = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(Object data, Node next){
        this.data = 0;
        this.next = next;
    }
}
