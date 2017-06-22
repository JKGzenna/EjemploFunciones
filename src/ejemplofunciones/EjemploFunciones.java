package ejemplofunciones;

/**
 *
 * @author JUAN
 */
public class EjemploFunciones {

    static int multiplicaPorTres(int p) {
        int r = p * 3;
        return r;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = multiplicaPorTres(a);
        
        System.out.println(b);
    }
    
}
