package ejercicio2;

public class Primos {

    public Primos(){}

    public static boolean esPrimo(int numero){
        if(numero >= 2) {
            if (numero % 2 == 0) {
                return true;
            }
            else{
                return false;
            }
        }

        else{
            return false;
        }
    }
}
