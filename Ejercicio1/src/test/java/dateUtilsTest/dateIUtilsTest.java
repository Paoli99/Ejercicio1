package dateUtilsTest;

import ejercicio1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class dateIUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "4, mayo, 2020, dia incorrecto",
            "5, mayo, 2020 , dia incorrecto",
            "6, mayo, 2020, 6 mayo 2020",
            "4, junio, 2020 , ingresar nuevos datos",
            "5, junio, 2020 , ingresar nuevos datos",
            "6, junio, 2020 , mes incorrecto",
            "4, mayo, 2021 , ingresar nuevos datos",
            "5, mayo, 2021 ,ingresar nuevos datos",
            "6, mayo, 2021, gestion incorrecto",

            "27, febrero, 2020, mayo 2020, dia incorrecto",
            "28, febrero, 2020,  mayo 2020 , dia incorrecto",
            "29, febrero, 2020, 29 febrero 2020",
            "27, enero, 2020 , ingresar nuevos datos",
            "28, enero, 2020 , ingresar nuevos datos",
            "29, enero, 2020 , mes incorrecto",
            "27, febrero, 2021 , ingresar nuevos datos",
            "28, febrero, 2021 ,ingresar nuevos datos",
            "29, febrero, 2021, gestion incorrecto",

            "27, febrero, 2021, dia incorrecto",
            "28, febrero, 2021 , dia incorrecto",
            "1, marzo, 2021, 1 marzo 2021",
            "27, enero, 2021 , ingresar nuevos datos",
            "28, enero, 2021 , ingresar nuevos datos",
            "1, enero, 2021 , mes incorrecto",
            "27, febrero, 2021, ingresar nuevos datos",
            "28, febrero, 2021 ,ingresar nuevos datos",
            "1, marzo, 2022, gestion incorrecto",

    })


    public void verifyTheMessageNota(int day , String month, int year, String expectedResult) {
        DateUtils date = new DateUtils();
        String actualResult = date.nextDate(day,month,year);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR, el mensaje retornado es incorrecto!!");
    }
}
