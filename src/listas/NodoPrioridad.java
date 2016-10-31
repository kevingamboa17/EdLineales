package listas;

/**
 * Created by kevingamboa17 on 10/6/16.
 */
public class NodoPrioridad {
    protected int prioridad;
    protected Object dato;

    public NodoPrioridad(int prioridad, Object dato) {
        this.setPrioridad(prioridad);
        this.setDato(dato);
    }


    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public String toString(){
        return "\nPrioridad: " + prioridad + "\nDato: " + dato;
    }


}
