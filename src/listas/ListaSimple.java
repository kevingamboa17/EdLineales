package listas;

/**
 * Created by kevingamboa17 on 9/20/16.
 */
public class ListaSimple extends Lista {
    @Override
    public void insertarInicio(Object dato) {
        if (vacio())
            inicio = ultimo = new Nodo(dato);
        else {
            inicio = new Nodo(dato, inicio);
        }
    }

    @Override
    public void insertarFinal(Object dato) {
        if (vacio())
            inicio = ultimo = new Nodo(dato);
        else {
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
            ultimo = temp;
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
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Nodo actual = inicio;
        while (actual != null){
            if (actual.getSiguiente() == null){
                System.out.println(actual);
            }
            else {
                actual = actual.getSiguiente();
            }

        }
        return null;
    }

    public Object get(int index){
        Nodo actual = inicio;
        String nulo= "La posición está vacía" ;
        int cont=1;
        while(actual != null){
            if (cont == index)
                    return actual.getDato();
            cont++;
            actual = actual.siguiente;
        }
        return nulo;

    }

    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();
        lista.insertarInicio(25);
        lista.insertarInicio("Perro");
        lista.insertarInicio(256.3);
        lista.insertarInicio('f');
        //lista.insertarFinal("casa");
        lista.Imprimir();
        lista.eliminaFinal();
        lista.Imprimir();
        //System.out.println("\n" + lista.get(-1));
    }
}
