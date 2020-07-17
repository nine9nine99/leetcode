package combineTwoLinkList;

import LinkList.List;

public class combineTest {
    public static void main(String[] args){
        combine test = new combine();
        List l1 = test.CreatLinkList_1(3);
        List l2 = test.CreatLinkList_2(3);
        test.Solution(l1, l2);
    }
}
