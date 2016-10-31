package deque;

/**
 * Created by kevingamboa17 on 10/17/16.
 */
public interface Deque {
    public int size();
    public boolean isEmpty();
    public void insertFirst(Object dato);
    public void insertLast(Object dato);
    public Object removeFirst();
    public Object removeLast();
    public Object first();
    public Object last();

}
