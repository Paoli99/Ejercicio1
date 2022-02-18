package ejercicio2;

public class Generador {
    Primos primos;

    public  Generador(Primos servicioMock){
        primos = servicioMock;
    }

    public String getNumberValues(int num){
        String msg = " ";

        if(Primos.esPrimo(num)){
            for(int i =1; i < num; i++){
                if(i%2 == 0){
                    msg = i + " ";
                }
                break;
            }
        }

        else{
            for(int i =1; i < num; i++) {
                if (i % 2 != 0) {
                    msg = i + " ";
                }
                break;
            }
        }
        return msg;
    }
}
