package listas;

/**
 * Created by kevingamboa17 on 10/4/16.
 */
public abstract class ListaD extends Lista {
    protected NodoDoble inicio;
    protected NodoDoble ultimo;


    @Override
    public NodoDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    @Override
    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }

    public boolean vacio(){
        return inicio == null;
    }

    public void imprimir(){
        NodoDoble actual = inicio;
        while (actual != null){
            System.out.print(actual.getDato() + " --> ");
            actual = actual.siguiente;
        }
    }

    public void imprimirAlReves(){
        NodoDoble actual = ultimo;
        while (actual != null){
            System.out.print(actual.getDato() + " --> ");
            actual = actual.getAnterior();
        }
    }
}
