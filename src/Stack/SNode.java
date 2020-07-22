package Stack;

public class SNode {
    public int data;
    public SNode next;

    public SNode(){
        this.data = 0;
        this.next = null;
    }

    public SNode(int x){
        this.data = x;
        this.next = null;
    }

    public SNode(int x, SNode next){
        this.data = x;
        this.next = next;
    }

}
