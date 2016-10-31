package pilas;

import listas.ListaSimple;

/**
 * Created by kevingamboa17 on 10/10/16.
 */
public class PilaListaSimple implements Pila {

    protected ListaSimple pilaLista;
    protected int cont;

    public PilaListaSimple() {
        pilaLista = new ListaSimple();
    }

    @Override
    public void push(Object dato) {
        pilaLista.insertarInicio(dato);
        cont++;
    }

    @Override
    public Object pop() {
        if (pilaLista.vacio())
            return null;
        else {
            cont--;
            return pilaLista.eliminaInicio();
        }
    }

    @Override
    public Object top() {
        if (pilaLista.vacio())
            return null;
        else
            return pilaLista.getInicio().getDato();
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return pilaLista.vacio();
    }

    public static void main(String args[]){
        PilaListaSimple pila = new PilaListaSimple();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while (!pila.isEmpty())
            System.out.println(pila.pop());
    }
}
