package listas;

/**
 * Created by kevingamboa17 on 9/13/16.
 */

public class Nodo {
    protected Object dato;
    protected Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Object dato, Nodo siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public Nodo(Object dato) {
        this.setDato(dato);
    }

    /**
     *
     * @return dato;
     */
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
