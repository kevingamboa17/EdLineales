package pilas;

import listacirculares.ListaDobleCircular;
import listas.ListaDoble;

/**
 * Created by kevingamboa17 on 10/18/16.
 */
public class PilaListaDobleCircular implements Pila {
    protected ListaDobleCircular pilaListaDobleCircular;
    protected int cont;

    public PilaListaDobleCircular() {
        pilaListaDobleCircular = new ListaDobleCircular();
    }

    @Override
    public void push(Object dato) {
        pilaListaDobleCircular.insertarInicio(dato);
        cont++;
    }

    @Override
    public Object pop() {
        if (pilaListaDobleCircular.vacio())
            return null;
        else {
            cont--;
            return pilaListaDobleCircular.eliminaInicio();
        }
    }

    @Override
    public Object top() {
        if (pilaListaDobleCircular.vacio())
            return null;
        else
            return pilaListaDobleCircular.getInicio().getDato();
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return pilaListaDobleCircular.vacio();
    }

    public static void main(String args[]){
        PilaListaDobleCircular pila = new PilaListaDobleCircular();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while (!pila.isEmpty())
            System.out.println(pila.pop());
    }
}
