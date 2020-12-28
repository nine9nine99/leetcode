package Link.combineTwoLinkList;

import LinkList.List;
import LinkList.Node;

/**
 * 将两个链表合并
 * */

public class combine {

    public List CreatLinkList_1(int maxsize){
        /**
         * 用于创建链表
         * */
        List list = new List();
        list.insert(0,1);
        list.insert(1, 2);
        list.insert(2, 3);

        return list;

    }

    public List CreatLinkList_2(int maxsize){
        /**
         * 用于创建链表
         * */
        List list = new List();
        list.insert(0,1);
        list.insert(1, 4);
        list.insert(2, 5);

        return list;

    }

    public void Solution(List l1, List l2){
        /**
         * 暴力解法
         * 用于将两个链表结合
         * @param Lc 辅助结点用于作为记录指针
         * @param L1 用于指向L1中当前的位置
         * @param L2 用于指向L2中当前的位置
         * */

        Node prev = new Node(-1, null); //设置哑结点
        Node Lc = prev;

        //初始化位置
        Node L1 = l1.head.next;
        Node L2 = l2.head.next;

        while (L1!=null&&L2!=null){
            //L1 = L1.next;
            //L2 = L2.next;
            if (L1.data>L2.data){
                Lc.next = L2;
                L2 = L2.next;
            }else {
                Lc.next = L1;
                L1 = L1.next;
            }
            Lc = Lc.next;
        }

        Lc.next = L1 == null?L2:L1;

        Node display = prev;
        while (display.next!=null){
            System.out.print(display.next.data+"\t");
            display = display.next;
        }
        //return l1;
    }
}

