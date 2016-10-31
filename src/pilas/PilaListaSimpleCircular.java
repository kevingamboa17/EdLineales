package pilas;

import listacirculares.ListaSimpleCircular;
import listas.ListaSimple;

/**
 * Created by kevingamboa17 on 10/18/16.
 */
public class PilaListaSimpleCircular implements Pila {
    protected ListaSimpleCircular pilaListaCircular;
    protected int cont;

    public PilaListaSimpleCircular() {
        pilaListaCircular = new ListaSimpleCircular();
    }

    @Override
    public void push(Object dato) {
        pilaListaCircular.insertarInicio(dato);
        cont++;
    }

    @Override
    public Object pop() {
        if (pilaListaCircular.vacio())
            return null;
        else {
            cont--;
            return pilaListaCircular.eliminaInicio();
        }
    }

    @Override
    public Object top() {
        if (pilaListaCircular.vacio())
            return null;
        else
            return pilaListaCircular.getInicio().getDato();
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return pilaListaCircular.vacio();
    }

    public static void main(String args[]){
        PilaListaSimpleCircular pila = new PilaListaSimpleCircular();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while (!pila.isEmpty())
            System.out.println(pila.pop());
    }
}
