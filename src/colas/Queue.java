package colas;

/**
 * Created by kevingamboa17 on 10/13/16.
 */
public interface Queue {
    public void enqueue(Object dato);
    public Object dequeue();
    public int size();
    public Object front();
    public boolean isEmpty();
}
