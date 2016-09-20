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

    }

    @Override
    public Object eliminaInicio() {
        return null;
    }

    @Override
    public Object eliminaFinal() {
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
        lista.Imprimir();
        System.out.println("\n" + lista.get(-1));
    }
}
