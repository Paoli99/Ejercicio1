package ejercicio2;

public class Primos {

    public Primos(){}

    /*public int esPrimo(int numero) {
        int x;
        int a = 0;
        for (int i = 2; i <= numero / 2; i++) {
            x = numero % i;
            if (x == 0) {
                a=1; // no es primo
            } else {
                a=0; // es primo
            }
        }
        return a;
    } */

    public static boolean esPrimo(int numero){
        for (int i = 2; i < numero; i++)
            if (numero % i == 0){
                return false;
            }

        return true;
    }
}
