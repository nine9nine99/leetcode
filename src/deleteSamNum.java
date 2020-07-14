import LinkList.List;

public class deleteSamNum {
    public static void main(String[] args){
        List list = new List();
        list.insert(0,"1");
        list.insert(1,"1");
        list.insert(2,"2");
        list.display();
        list.findSame();
        list.display();
    }
}
