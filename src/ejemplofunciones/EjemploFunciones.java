package ejemplofunciones;

/**
 *
 * @author JUAN
 */
public class EjemploFunciones {
    // declaracion de la funcion, la declaramos static porque va a ser llamada desde la función main
    static int multiplicaPorTres(int p) {
        int r = p * 3;
        return r;
    }
    // llamada a la función desde la función main
    public static void main(String[] args) {
        int a = 5;
        int b = multiplicaPorTres(a);
        
        System.out.println(b);
    }
    
}
