package ejercicio1;

public class DateUtils {
    public String nextDate(int day , String month, int year){
        String msg;

        if( (day == 6) && (month == "mayo") && (year == 2020))
            msg = (day + ' ' + month + ' ' +year);
        else if ( (day != 6) && (month == "mayo") && (year == 2020))
            msg = ("dia incorrecto");
        else if ( (day == 6) && (month != "mayo") && (year == 2020))
            msg = ("mes incorrecto");
        else if ( (day == 6) && (month != "mayo") && (year != 2020))
            msg = ("gestion incorrecta");
        else
            msg = "ingresar nuevos datos";

        if( (day == 29) && (month == "febrero") && (year == 2020))
            msg = (day + ' ' + month + ' ' +year);
        else if ( (day != 29) && (month == "febrero") && (year == 2020))
            msg = ("dia incorrecto");
        else if ( (day == 29) && (month != "febrero") && (year == 2020))
            msg = ("mes incorrecto");
        else if ( (day == 29) && (month == "febrero") && (year != 2020))
            msg = ("gestion incorrecta");
        else
            msg = "ingresar nuevos datos";

        if( (day == 1) && (month == "marzo") && (year == 2021))
            msg = (day + ' ' + month + ' ' +year);
        else if ( (day != 1) && (month == "marzo") && (year == 2021))
            msg = ("dia incorrecto");
        else if ( (day == 1) && (month != "marzo") && (year == 2021))
            msg = ("mes incorrecto");
        else if ( (day == 1) && (month == "marzo") && (year != 2021))
            msg = ("gestion incorrecta");
        else
            msg = "ingresar nuevos datos";

        return msg;
    }
}
