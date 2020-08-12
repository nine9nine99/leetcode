package changeBinary;

import LinkList.List;

public class changeBinaryTest {
    public static void main(String[] args){
        List list = new List();
        list.insert(0, 0);
        list.insert(0, 0);
        list.insert(0, 1);
        list.display();
        changeBinary newnum = new changeBinary();
        int result = newnum.Solution(list.head);
        System.out.println(result);
    }
}
