package deque;

import listas.ListaSimple;

/**
 * Created by kevingamboa17 on 10/17/16.
 */
public class DequeListaSimple implements Deque {
    protected ListaSimple lista;
    protected int cont;

    public DequeListaSimple(){
        lista = new ListaSimple();
    }

    @Override
    public int size() {
         return cont;
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }

    @Override
    public void insertFirst(Object dato) {
        lista.insertarInicio(dato);
        cont++;
    }

    @Override
    public void insertLast(Object dato) {
        lista.insertarFinal(dato);
        cont++;
    }

    @Override
    public Object removeFirst() {
        if (!lista.vacio()){
            cont--;
            return lista.eliminaInicio();
        }
        return null;
    }

    @Override
    public Object removeLast() {
        if (!lista.vacio()){
            cont--;
            return lista.eliminaFinal();
        }
        return null;
    }

    @Override
    public Object first() {
        if (!lista.vacio()){
            return lista.getInicio().getDato();
        }
        return null;
    }

    @Override
    public Object last() {
        if (!lista.vacio()){
            return lista.getUltimo().getDato();
        }
        return null;
    }

    public static void main(String[] args){
        DequeListaSimple deque= new DequeListaSimple();
        deque.insertFirst("hola");
        deque.insertLast(2536);
        deque.insertFirst("quepaxo");
        deque.insertFirst(true);
        while (!deque.isEmpty()){
            System.out.println(deque.removeFirst());
            System.out.println(deque.first());
        }
    }
}
