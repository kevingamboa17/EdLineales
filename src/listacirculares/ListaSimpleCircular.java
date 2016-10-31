package listacirculares;

import listas.Lista;
import listas.Nodo;

/**
 * Created by kevingamboa17 on 10/18/16.
 */
public class ListaSimpleCircular extends Lista{

    @Override
    public void insertarInicio(Object dato) {
        if (vacio()){
            inicio = ultimo = new Nodo(dato);
            ultimo.setSiguiente(inicio);
        }
        else {
            inicio = new Nodo(dato, inicio);
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertarFinal(Object dato) {
        if (vacio()){
            inicio = ultimo = new Nodo(dato);
            ultimo.setSiguiente(inicio);
        }
        else {
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
            ultimo = temp;
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado;
        if (vacio())
            eliminado = null;
        else {
            eliminado = inicio.getDato();
            inicio = inicio.getSiguiente();
            ultimo.setSiguiente(inicio);
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Object dato = null;
        Nodo actual = this.getInicio();
        Nodo aux = null;
        while (actual != null){
            aux = actual;
            actual = actual.getSiguiente();
            if (actual.getSiguiente() == inicio){
                aux.setSiguiente(inicio);
                dato = actual.getDato();
                actual = null;
            }

        }
        return dato;
    }

    @Override
    public void Imprimir(){
        Nodo actual = inicio;
        System.out.print(actual.getDato() + "->");
        actual = actual.getSiguiente();
        while(actual != null && actual!=inicio ){
            System.out.print(actual.getDato() + "->");
            actual = actual.getSiguiente();
        }
    }

    public static void main(String[] args){
        ListaSimpleCircular lista= new ListaSimpleCircular();
        lista.insertarInicio("estás ");
        lista.insertarInicio("cómo ");
        lista.insertarInicio("hola ");
        lista.insertarInicio("no debe salir de primero");
        lista.insertarFinal("final");
        lista.eliminaInicio();
        lista.eliminaFinal();
        lista.Imprimir();
    }
}
