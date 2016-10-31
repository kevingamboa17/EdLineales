package colas;

import listas.ListaSimple;

/**
 * Created by kevingamboa17 on 10/13/16.
 */
public class ColaListaSimple implements Queue {
    protected ListaSimple lista;
    protected int cont;

    public ColaListaSimple() {
        lista = new ListaSimple();
        cont = 0;
    }



    @Override
    public void enqueue(Object dato) {
        lista.insertarFinal(dato);
        cont++;
    }

    @Override
    public Object dequeue() {
        if (!lista.vacio()){
            cont--;
            return lista.eliminaInicio();
        }
        return null;
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public Object front() {
        if (!lista.vacio()){
            return lista.getInicio().getDato();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }

    public static void main(String[] args){
        ColaListaSimple cola= new ColaListaSimple();
        cola.enqueue("Hola");
        cola.enqueue(336);
        cola.enqueue(25.78);
        cola.enqueue(true);
        while (!cola.isEmpty())
            System.out.print(cola.dequeue() + "->");
    }
}
