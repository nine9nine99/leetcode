package Link.changeBinary;

import LinkList.Node;

/**
 * 二进制链表转整数
 * */

public class changeBinary {
    public int Solution(Node head){
        int result = 0; //幂从0开始
        Node next = head.next;
        while (next!=null){
            result = result*2+next.data;
            next = next.next;
        }
        return result;
    }
}
