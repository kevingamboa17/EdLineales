package listas;

/**
 * Created by kevingamboa17 on 10/4/16.
 */
public class ListaDoble extends ListaD {
    @Override
    public void insertarInicio(Object dato) {
        if (vacio())
            inicio = ultimo = new NodoDoble(dato);
        else {
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
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
                inicio.setAnterior(null);
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
        aux.setSiguiente(null);
        ultimo = aux;

        return eliminado;

    }

    public static void main(String args[]){
        ListaDoble listaD = new ListaDoble();
        listaD.insertarInicio(20);
        listaD.insertarInicio("perro");
        listaD.insertarInicio(4);
        listaD.insertarInicio(45.6);
        System.out.println("Imprimiendo la lista normal ...");
        listaD.imprimir();
        System.out.println("\nImprimiendo la lista en orden inverso...");
        listaD.imprimirAlReves();
    }
}
