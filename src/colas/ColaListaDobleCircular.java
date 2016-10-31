package colas;

import listacirculares.ListaDobleCircular;
import listas.ListaDoble;

/**
 * Created by kevingamboa17 on 10/18/16.
 */
public class ColaListaDobleCircular implements Queue {
    protected ListaDobleCircular lista;
    protected int cont;

    public ColaListaDobleCircular() {
        lista = new ListaDobleCircular();
        cont=0;
    }

    @Override
    public void enqueue(Object dato) {
        lista.insertarInicio(dato);
        cont++;
    }

    @Override
    public Object dequeue() {
        if (!lista.vacio()){
            cont--;
            return lista.eliminaFinal();
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
            return lista.getUltimo().getDato();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }

    public static void main(String[] args){
        ColaListaDobleCircular cola= new ColaListaDobleCircular();
        cola.enqueue("Hola");
        cola.enqueue(336);
        cola.enqueue(25.78);
        cola.enqueue(true);
        while (!cola.isEmpty())
            System.out.print(cola.dequeue() + "->");
    }
}
