package pilas;

/**
 * Created by kevingamboa17 on 10/10/16.
 */
public interface Pila {

    public void push(Object dato);
    public Object pop();
    public Object top();
    public int size();
    public boolean isEmpty();
}
