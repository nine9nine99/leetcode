package CircleLInk;

import LinkList.List;
import LinkList.Node;

public class CircleLink {
    public List CreatCircleLink(){
        List list = new List();
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2,1, 3);

        return list;
    }


    /**
     * 判断是否为循环链表
     * */
    public boolean Solution(List list){
        /**
         * 通过使用快慢指针检查是否有循环链表
         * @param fast 快指针
         * @param low 慢指针
         * */
        Node fast = list.head.next;
        Node slow = list.head;

        while (fast.data!=slow.data){
            if (fast==null||fast.next==null){
                return false;
            }else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return true;
    }
}
