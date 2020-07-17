package LinkList;

public interface IList {
    public void clear();
    public boolean isEmpty();
    public Object get(int i);
    public void insert(int i,int x);
    public void remove(int x);
    public int indexOf(Object x);
}
