package Points.ReverseLinkList;

import LinkList.List;
import LinkList.Node;

/**
 * 反转链表
 *
 * */
public class ReverseTest {
    public static void main(String[] args){
        ReverseLink test = new ReverseLink();
        List L = test.CreatList();
        //test.display(L);
        Node prev = test.Solution(L);
        test.display(prev);
    }
}
