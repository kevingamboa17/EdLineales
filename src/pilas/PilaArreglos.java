package pilas;

import java.lang.reflect.Array;

/**
 * Created by kevingamboa17 on 10/10/16.
 */
public class PilaArreglos implements Pila {
    protected Object[] pilaArreglo;
    protected int cont;

    public PilaArreglos() {
        pilaArreglo = new Object[100];
    }

    @Override
    public void push(Object dato) {
        int i;
        for (i=cont-1;i>=0;i--){
            pilaArreglo[i+1]=pilaArreglo[i];
        }
        pilaArreglo[0] = dato;
        cont++;
    }

    @Override
    public Object pop() {
        if (isEmptyArreglo(pilaArreglo))
            return null;
        else {
            cont--;
            return eliminaInicioArreglo(pilaArreglo);
        }
    }

    @Override
    public Object top() {
        if (isEmptyArreglo(pilaArreglo))
            return null;
        else
            return pilaArreglo[0];

    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return isEmptyArreglo(pilaArreglo);
    }



    public boolean isEmptyArreglo(Object[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i] != null)
                return false;
        }
        return true;
    }

    public Object eliminaInicioArreglo(Object[] arreglo){
        Object aux;
        aux = arreglo[0];
        for (int i=0;i<arreglo.length-1;i++){
            arreglo[i] = arreglo[i+1];
        }
        arreglo[arreglo.length-1]= null;
        return aux;
    }

    public static void main(String args[]){
        PilaArreglos pila = new PilaArreglos();
        pila.push("h");
        pila.push("o");
        pila.push("l");
        pila.push("a");
        while (!pila.isEmpty())
            System.out.println(pila.pop());
    }
}
