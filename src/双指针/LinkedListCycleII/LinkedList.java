package 双指针.LinkedListCycleII;

import LinkList.List;
import LinkList.Node;

/**
 * 142 快慢指针
 */

public class LinkedList {
    public Node Solution(List list){
        Node fast = list.head;
        Node slow = list.head;
        do {
            if (fast==null || fast.next==null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
        }while (slow!=fast);

        fast = list.head;
        while (slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public static void main(String[] args){
        List list = new List();
        list.insert(0, 1);
        list.insert(1, 2);
        list.create_circle_link(2,3, 2);

        LinkedList linkedList = new LinkedList();
        Node result = linkedList.Solution(list);
        System.out.println(result.data);
    }
}
