package 双指针.ReverseLinkList;

import LinkList.List;
import LinkList.Node;

public class ReverseLink {
    public List CreatList(){
        List L = new List();

        L.insert(0,1);
        L.insert(1, 2);
        L.insert(2, 3);

        return L;
    }

    public Node Solution(List L){
        /**
         * @param prev 反转指针
         * @param l 指向当前需要反转指针
         * @param next 下一个需要翻转的指针
         * */
        Node prev = new Node(-1, null);
        Node l = L.head;
        while (l!=null){
            Node nextnode = l.next;
            l.next = prev;
            prev = l;
            l = nextnode;
        }
        return prev;
    }

    public void display(Node prev){
        Node start = prev;
        while (start.next!=null){
        System.out.print(start.data+"\t");
        start = start.next;
        }
    }
}
