package colas;

import listacirculares.ListaSimpleCircular;
import listas.ListaSimple;

/**
 * Created by kevingamboa17 on 10/18/16.
 */
public class ColaListaSimpleCircular implements Queue {
    protected ListaSimpleCircular lista;
    protected int cont;

    public ColaListaSimpleCircular() {
        lista = new ListaSimpleCircular();
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
        ColaListaSimpleCircular cola= new ColaListaSimpleCircular();
        cola.enqueue("Hola");
        cola.enqueue(336);
        cola.enqueue(25.78);
        cola.enqueue(true);
        while (!cola.isEmpty())
            System.out.print(cola.dequeue() + "->");
    }
}
