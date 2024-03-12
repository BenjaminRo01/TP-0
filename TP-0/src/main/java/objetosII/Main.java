package objetosII;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Implementacion de un modelo anemico.");
        /*
        El modelo anemico se caracteriza por tener entidades que funcionan principalmente
        como contenedores de datos (podria ser considerado como DTO's), sin encapsular
        logica o comportamientos especificos del dominio (generalmente poseen getters y
        setters).
         */
        TiempoAnemico tiempoAnemico = new TiempoAnemico(fechaActual);
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("En formato largo: " + tiempoAnemico.getFecha().format(formatoLargo));
        System.out.println("En formato corto: " + tiempoAnemico.getFecha().format(formatoCorto));

        System.out.println("\nImplementacion de un modelo no anemico.");
        /*
        El modelo anemico esta alejado del concepto de POO donde se promueve que los
        objetos combinen datos (atributos) con comportamientos (metodos) generando
        entidades autonomas y cohesivas que encapsular la complejidad.
         */
        Tiempo tiempo = new Tiempo(fechaActual);
        System.out.println("En formato largo: " + tiempo.enFormatoLargo());
        System.out.println("En formato corto: " + tiempo.enFormatoCorto());


        System.out.println("\nUtilizando Record");
        /*
        Está diseñado para simplificar la creación de clases cuyo único propósito es almacenar
        datos y proporcionar métodos de acceso.
         */
        TiempoRecord tiempoRecord = new TiempoRecord(fechaActual);
        System.out.println("En formato largo: " + tiempoRecord.fecha().format(formatoLargo));
        System.out.println("En formato corto: " + tiempoRecord.fecha().format(formatoCorto));
    }
}