package LinkList;


public class List implements IList{

    public Node head;

    public List(){
        head = new Node();
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        if (head.next==null){
            return true;
        }else
            return false;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void insert(int i, int x) {
        Node p = head;
        int j = -1;
        while (p != null && j<i-1){
            p = p.next;
            ++j;
        }
        Node s = new Node(x);
        s.next = p.next;
        p.next = s;
    }

    //插入环形结点
    public void insert(int i, int target, int x){
        Node p = head;
        int j = -1;
        while (p != null && j<i-1){
            p = p.next;
            ++j;
        }
        Node s = new Node(x);
        //s.next = p.next;
        p.next = s;

        Node curr = head;
        for (int m=0; j<=target; j++){
            curr = curr.next;
        }
        s.next = curr.next;
    }

    @Override
    public void remove(int i) {
        int j=-1;
        if (isEmpty()){
            System.out.println("链队为空");
        }
        Node p = head;
        while (j<i-1&&p.next!=null){
            p = p.next;
            j++;
        }
        p.next = p.next.next;
    }

    @Override
    public int indexOf(Object x) {
        return 0;
    }

    public void findSame(){
        Node current = head;
        while (current.next!=null&&current!=null){
            Node check = current.next;
            if (current.data==check.data){
                current.next = check.next;
            }else {
                current = current.next;
            }
        }
        display();
    }

    public void display(){
        Node p = head;
        while (p.next!=null){
            p = p.next;
            System.out.print(p.data);
        }
        System.out.println();
    }
}
