package listas;

/**
 * Created by kevingamboa17 on 9/20/16.
 */
public abstract class Lista {
    protected Nodo inicio;
    protected Nodo ultimo;
    protected String nombre;

    public Lista(){
        this("lista");
    }

    public Lista (String nombre){
        this.nombre = nombre;
    }

    public boolean vacio(){
        return inicio==null;
    }

    public abstract void insertarInicio(Object dato);
    public abstract void insertarFinal(Object dato);
    public abstract Object eliminaInicio();
    public abstract Object eliminaFinal();

    public void Imprimir(){
        Nodo actual = inicio;
        while(actual != null){
            System.out.print(actual.getDato() + "->");
            actual = actual.siguiente;
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
