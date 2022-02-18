package primoTest;

import ejercicio2.Primos;
import  ejercicio2.Generador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PrimoTest {
    Primos servicioMock = Mockito.mock(Primos.class);
    @Test
    public void testEvenOddNumber(){

        Mockito.when(servicioMock.esPrimo(8)).thenReturn(false);

        Generador generador = new Generador(servicioMock);

        String actualResult = generador.getNumberValues(8);
        String expectedResult = "2 4 6";
        Assertions.assertEquals(expectedResult, actualResult, "Error");

    }


    /*@Test
    public void testPrimo(){
        Primos primos = new Primos();

        boolean expectedResults = true;
        boolean actualResults = Primos.esPrimo(11);
        Assertions.assertEquals(expectedResults, actualResults, "error");
    } */

}
