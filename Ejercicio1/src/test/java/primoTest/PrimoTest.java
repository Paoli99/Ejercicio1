package primoTest;

import ejercicio2.Primos;
import  ejercicio2.Generador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PrimoTest {

    @Test
    public void testEvenOddNumber(){
        Primos meo = new Primos();

        boolean expectedResults = true;
        boolean actualResults = Primos.esPrimo(22);
        Assertions.assertEquals(expectedResults, actualResults, "Error");
    }
}
