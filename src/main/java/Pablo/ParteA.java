/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pablo;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ParteA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        La idea es que tu programa ayude a los dueños de la tienda 
        a saber cuánto han cobrado cada día y al final de la semana, 
        suponiendo que todas las reparaciones cuestan 32.6€ (double)
        y todas las semanas trabajan de lunes a viernes (5 días). 
        Una vez leídos los datos del número de reparaciones que hay cada día 
        (de lunes a viernes) se deben mostrar los datos de lo que se
        ha cobrado cada día (float) y al final de la semana (float). Ten en cuenta que
        se debe limitar la salida por consola a 3 números decimales.
        En esta parte todos los datos deben leerse por teclado usando Scanner
        y mostrarse usando la consola.
        
        
         */

        //Declaracion del scanner
        Scanner teclado = new Scanner(System.in);
        //variables constante
        final double REPARACIONES = 32.6;
        //variables
        int numeroReparacionesDelDia;

        float reparacionesTotalSemana;

        float reparacionesLunes;
        float reparacionesMartes;
        float reparacionesMiercoles;
        float reparacionesJueves;
        float reparacionesViernes;

        //Entrada de Datos
        //Lunes
        System.out.println(" Cuantas reparaciones a habido el lunes?");

        //Poner el escaner que sea un Int.
        numeroReparacionesDelDia = teclado.nextInt();
        //Salida de datos de system out monstando el numero de 
        //reparaciones diarias
        System.out.println(" El numero de reparaciones de este lunes son "
                + numeroReparacionesDelDia);

        //Formula de calculo del dia 
        reparacionesLunes = (float) (REPARACIONES * numeroReparacionesDelDia);

        //Resultado de las reparaciones del Lunes
        //Que salgan 3 decimales despues de la coma
        System.out.printf(" %.3f " + "€", reparacionesLunes);

        //Martes
        //Entrada de datos
        System.out.printf(" Cuantas reparaciones a habido el Martes?");

        //Poner el escaler que sea un Int
        numeroReparacionesDelDia = teclado.nextInt();
        //Salida de datos de system out
        System.out.println(" El numero de reparaciones de este Martes son "
                + numeroReparacionesDelDia);

        //Formula de calculo del dia 
        reparacionesMartes = (float) (REPARACIONES * numeroReparacionesDelDia);

        //Resultado de las reparaciones del Martes
        //salgan 3 decimales despues de la coma
        System.out.printf(" %.3f " + "€", reparacionesMartes);

        //Miercoles
        //Entrada de datos
        System.out.println(" Cuantas reparaciones a habido el Miercoles?");

        //Poner el escamer que sea un Int
        numeroReparacionesDelDia = teclado.nextInt();
        //Salida de datos de system out
        System.out.println(" El numero de reparaciones de este Miercoles son "
                + numeroReparacionesDelDia);

        //Formula de calculo del dia a dia 
        reparacionesMiercoles = (float) (REPARACIONES
                * numeroReparacionesDelDia);

        //Resultado de las reparaciones del Lunes
        //Que salga 3 deciamales
        System.out.printf(" %.3f " + "€", reparacionesMiercoles);

        //Jueves
        //Entrada de datos
        System.out.println(" Cuantas reparaciones a habido el Jueves?");

        //Poner el escaler que sea un Int
        numeroReparacionesDelDia = teclado.nextInt();
        //Salida de datos de system out
        System.out.println(" El numero de reparaciones de este Jueves son "
                + numeroReparacionesDelDia);

        //Formula de calculo del dia a dia 
        reparacionesJueves = (float) (REPARACIONES * numeroReparacionesDelDia);

        //Resultado de las reparaciones del Lunes
        System.out.printf(" %.3f " + "€", reparacionesJueves);

        //Viernes
        //Entrada de datos
        System.out.println(" Cuantas reparaciones a habido el Viernes?");

        //Poner el escaler que sea un Int
        numeroReparacionesDelDia = teclado.nextInt();
        //Salida de datos de system out
        System.out.println(" El numero de reparaciones de este Viernes son "
                + numeroReparacionesDelDia);

        //Formula de calculo del dia a dia 
        reparacionesViernes = (float) (REPARACIONES * numeroReparacionesDelDia);

        //Resultado de las reparaciones del Viernes
        System.out.printf(" %.3f " + "€", reparacionesViernes);

        //RecuentoTotal de la semana
        //Formula para calcular toda la semana
        reparacionesTotalSemana
                = reparacionesLunes
                + reparacionesMartes
                + reparacionesMiercoles
                + reparacionesJueves
                + reparacionesViernes;
        //Salida de datos de la semana

        String resultado = """
                          En PCROTO hemos ganado esta semana
                          ----------------------------------
                          Lunes :----%.3f€
                          Martes:----%.3f€
                          Miercoles:-%.3f€
                          Juevees:---%.3f€
                          Viernes:---%.3f€
                          En total hemos ganado esta semana:-%.3f€
                          
                                    
                          """.formatted(reparacionesLunes,
                reparacionesMartes,
                reparacionesMiercoles,
                reparacionesJueves,
                reparacionesViernes,
                reparacionesTotalSemana);

        System.out.println(resultado);
    }

}
