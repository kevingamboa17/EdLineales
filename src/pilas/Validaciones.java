package pilas;

/**
 * Created by kevingamboa17 on 10/11/16.
 */
public class Validaciones {

    public boolean validaParentesis(String cadena){
        PilaListaSimple pila= new PilaListaSimple();
        boolean valido= true;
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)=='(')
                pila.push('(');
            else {
                if (!pila.isEmpty())
                    pila.pop();
                else
                    valido = false;
            }
        }
        return valido && pila.isEmpty();
    }

    public boolean validaPalindromos(String cadena){
        PilaListaSimple pila= new PilaListaSimple();
        boolean valido= true;
        int mitad = cadena.length()/2;
        if (cadena.length()%2 ==0){
            for (int i=0;i<mitad;i++){
                pila.push(cadena.charAt(i));
            }
            for (int i=mitad;i<cadena.length();i++){
                if ((char)pila.pop() != cadena.charAt(i))
                    return false;
            }
             return true;
        }
        else {
            for (int i=0;i<mitad;i++){
                pila.push(cadena.charAt(i));
            }
            for (int i=mitad+1;i<cadena.length();i++){
                if ((char)pila.pop() != cadena.charAt(i))
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args){
        Validaciones valida=new Validaciones();
        if (valida.validaPalindromos("amoraroma"))
            System.out.println("Cadena valida");
        else
            System.out.println("Cadena inválida");
    }


}
