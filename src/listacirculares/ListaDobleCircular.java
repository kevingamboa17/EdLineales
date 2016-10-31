package listacirculares;

import listas.ListaD;
import listas.NodoDoble;

/**
 * Created by kevingamboa17 on 10/18/16.
 */
public class ListaDobleCircular extends ListaD {
    @Override
    public void insertarInicio(Object dato) {
        if (vacio()){
            inicio = ultimo = new NodoDoble(dato);
            ultimo.setSiguiente(inicio);
        }
        else {
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
            inicio.setAnterior(ultimo);
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertarFinal(Object dato) {
        if(vacio()){
            inicio = ultimo = new NodoDoble(dato);
        }else{
            NodoDoble nuevo = new NodoDoble(dato,null,ultimo);
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
            inicio.setAnterior(ultimo);
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("Lista vacía");
        }else{
            eliminado = inicio.getDato();
            if(inicio == ultimo){
                inicio = ultimo = null;
            }else{
                inicio = inicio.getSiguiente();
                inicio.setAnterior(ultimo);
                ultimo.setSiguiente(inicio);
            }
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        NodoDoble aux = null;
        Object eliminado = null;

        eliminado = ultimo.getDato();
        aux = ultimo.getAnterior();
        aux.setSiguiente(inicio);
        ultimo = aux;
        inicio.setAnterior(ultimo);

        return eliminado;
    }

    @Override
    public void imprimir(){
        NodoDoble actual = inicio;
        System.out.print(actual.getDato() + " --> ");
        actual = actual.getSiguiente();
        while (actual != null && actual!=inicio){
            System.out.print(actual.getDato() + " --> ");
            actual = actual.getSiguiente();
        }
    }

    @Override
    public void imprimirAlReves(){
        NodoDoble actual = ultimo;
        while (actual != inicio){
            System.out.print(actual.getDato() + " --> ");
            actual = actual.getAnterior();
        }
        System.out.print(inicio.getDato() + " --> ");
    }

    public static void main(String[] args){
        ListaDobleCircular lista= new ListaDobleCircular();
        lista.insertarInicio("No debe salir al final");
        lista.insertarInicio("estás ");
        lista.insertarInicio("cómo ");
        lista.insertarInicio("hola ");
        lista.insertarInicio("no debe salir primero");
        lista.eliminaFinal();
        lista.eliminaInicio();
        lista.insertarFinal("final");
        lista.imprimir();
        System.out.print("\n");
        lista.imprimirAlReves();
    }
}
