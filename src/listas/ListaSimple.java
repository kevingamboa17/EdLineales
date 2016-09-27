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

    public void insertaOrdenado(int dato){
        if (vacio()) {
            insertarInicio(dato);
        }
        else {
            if (inicio == ultimo){
                if (dato < (Integer)inicio.getDato()) {
                    insertarInicio(dato);
                }
                else {
                    insertarFinal(dato);
                }
            }
            else {
                Nodo antes = null, despues = inicio;
                while (despues!= null && dato > (Integer)despues.getDato()){
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

    public void insertaOrdenado(Alumno alumno) {
        if (vacio())
            insertarInicio(alumno);
        else {
            if (inicio == ultimo) {
                if (alumno.getEdad() < ((Alumno)inicio.getDato()).getEdad())
                    insertarInicio(alumno);
                else
                    insertarFinal(alumno);
            } else {
                Nodo antes = null, despues = inicio;
                while (despues != null && alumno.getEdad() > ((Alumno) despues.getDato()).getEdad()) {
                    antes = despues;
                    despues = despues.getSiguiente();
                }
                if (antes == null) {
                    insertarInicio(alumno);
                } else {
                    if (despues == null)
                        insertarFinal(alumno);
                    else {
                        Nodo nuevo = new Nodo(alumno, despues);
                        antes.setSiguiente(nuevo);
                    }
                }
            }
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
        Object dato = null;
        Nodo actual = this.getInicio();
        Nodo aux = null;
        while (actual != null){
            aux = actual;
            actual = actual.getSiguiente();
            if (actual.getSiguiente() == null){
                aux.setSiguiente(null);
                dato = actual.getDato();
                System.out.println(actual);
                actual = null;
            }

        }
        return dato;
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



    public void ImprimirAlumnos(){
        Nodo actual = inicio;
        while(actual != null){
            System.out.print(((Alumno)actual.getDato()).getNombre() + " " +
                    ((Alumno)actual.getDato()).getApellidos()  + " " +
                    ((Alumno)actual.getDato()).getEdad() + " " +
                    "-> ");
            actual = actual.siguiente;
        }
    }



    public static void main(String[] args){
        Alumno alumno1= new Alumno("Juan", "Gabriel", 10);
        Alumno alumno2= new Alumno("Armando", "Carvajal", 74);
        Alumno alumno3= new Alumno("marco", "Chavez", 33);
        Alumno alumno4= new Alumno("Kevin", "Gamboa", 17);
        ListaSimple lista = new ListaSimple();

        lista.insertaOrdenado(alumno1);
        lista.insertaOrdenado(alumno2);
        lista.insertaOrdenado(alumno3);
        lista.insertaOrdenado(alumno4);
        lista.ImprimirAlumnos();
    }
}
