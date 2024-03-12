package objetosII;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tiempo {
    private LocalDate fecha;

    public Tiempo(LocalDate fecha){
        //Se podría arrojar una excepcion en el caso de que se envie una fecha nula.
        this.fecha = fecha;
    }
    //¿Se podría agregar otro constructor que acepte dia, mes y año?
    public String enFormatoCorto(){
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fecha.format(formatoCorto);
    }
    public String enFormatoLargo(){
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return this.fecha.format(formatoLargo);
    }
}
