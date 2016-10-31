package listas;

/**
 * Created by kevingamboa17 on 10/4/16.
 */
public class NodoDoble extends Nodo{
    protected NodoDoble anterior;
    protected NodoDoble siguiente;


    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior) {
        super(dato);
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public NodoDoble(Object dato){
        super(dato);
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }



}
