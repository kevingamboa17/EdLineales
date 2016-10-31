package colas;

import listas.ListaDoble;

/**
 * Created by kevingamboa17 on 10/13/16.
 */
public class ColaListaDoble implements Queue {
    protected ListaDoble lista;
    protected int cont;

    public ColaListaDoble() {
        lista = new ListaDoble();
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
        ColaListaDoble cola= new ColaListaDoble();
        cola.enqueue("Hola");
        cola.enqueue(336);
        cola.enqueue(25.78);
        cola.enqueue(true);
        System.out.println(cola.front());
       /* while (!cola.isEmpty())
            System.out.print(cola.dequeue() + "->"); */
    }
}
