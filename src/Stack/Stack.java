package Stack;

public class Stack implements IStack{
    private SNode head;

    public Stack(){
        head = new SNode();
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public void push(int i) {
        SNode newNode = new SNode(i);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public int pull() {
        if (!isEmpty()){
            SNode out = new SNode();
            out = head;
            head = out.next;
            return out.data;
        }
        return -1;
    }

    @Override
    public int getHead() {
        return head.data;
    }

    public boolean isEmpty(){
        return head.next == null;
    }

    public int display(){
        SNode temp = head;
        if (!isEmpty()){
            while (temp.next!=null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
        return -1;
    }

    public int findMinNum(Stack stack){
        int min = Integer.MAX_VALUE;
        int temp;
        while (!stack.isEmpty()){
            temp = stack.pull();
            if (temp<min)
                min = temp;
        }
        return min;
    }

}