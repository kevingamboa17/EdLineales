package listas;

/**
 * Created by kevingamboa17 on 10/6/16.
 */
public class ListaPrioridad extends ListaSimple {
    public void insertaOrdenado(NodoPrioridad dato){
        if (vacio()) {
            insertarInicio(dato);
        }
        else {
            if (inicio == ultimo){
                if (dato.prioridad < ((NodoPrioridad)inicio.getDato()).getPrioridad()) {
                    insertarInicio(dato);
                }
                else {
                    insertarFinal(dato);
                }
            }
            else {
                Nodo antes = null, despues = inicio;
                while (despues!= null && dato.prioridad > ((NodoPrioridad)despues.getDato()).getPrioridad()){
                    antes = despues;
                    despues = despues.getSiguiente();
                }
                if (antes==null){
                    insertarInicio(dato);
                }
                else{
                    if (despues==null) {
                        insertarFinal(dato);
                    }
                    else {
                        Nodo nuevo = new Nodo(dato, despues);
                        antes.setSiguiente(nuevo);
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        NodoPrioridad nodo1 = new NodoPrioridad(1000, "perro");
        NodoPrioridad nodo2 = new NodoPrioridad(3, 39);
        NodoPrioridad nodo3 = new NodoPrioridad(5, "Hola");
        NodoPrioridad nodo4 = new NodoPrioridad(2, 25.3);
        ListaPrioridad listaP = new ListaPrioridad();
        listaP.insertaOrdenado(nodo4);
        listaP.insertaOrdenado(nodo1);
        listaP.insertaOrdenado(nodo3);
        listaP.insertaOrdenado(nodo2);
        listaP.Imprimir();
    }
}
