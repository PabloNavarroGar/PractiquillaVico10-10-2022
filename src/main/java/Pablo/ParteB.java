/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pablo;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ParteB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        Modifica el ejercicio anterior para que
        la lectura de datos y la salida por pantalla
        usen diálogos JOptionPane.
         Además, en esta parte, se debe preguntar cuánto se 
        va a cobrar por reparación cada día de la semana (double) y 
        luego preguntar cuántas reparaciones se han hecho cada día 
        (int).
        Una vez leídos los datos, calcula lo que se cobra cada día y al final 
        de la semana, guardando los datos en tipos float. Usa un text 
        block, limitando la
        salida a 1 decimal, para usarlo en un JOptionPane 
        que muestre la información de salida.
        Guarda el resultado de evaluar si se ha cobrado al 
        final de la semana más de 1000€, 
        mostrando el resultado por consola.
         */
        //variables
        double reparacionCosteRotatorio;
        int reparacionesDelDia;
        float gananciasLunes;
        float gananciasMartes;
        float gananciasMiercoles;
        float gananciasJueves;
        float gananciasViernes;
        float reparacionesTotalSemana;

        //Lunes
        //Creacion de panel de datos para introducir datos
        String costeLunesString = JOptionPane.showInputDialog(" Cuanto va a "
                + " valer la reparacion el Lunes ");

        //Transformacion de un dato(double) a un string
        reparacionCosteRotatorio = Double.parseDouble(costeLunesString);

        //Panel que muestra cuanto vale la reparacione
        JOptionPane.showMessageDialog(null,"La reparacion vale hoy"
                + reparacionCosteRotatorio + "€");

        //Veces que se a reparado hoy lunes
        String reparacionLunesString = JOptionPane.showInputDialog(" Cuantos "
                + "cliente hechos hemos hoy");

        //Transformacion de un dato(int) a un string
        reparacionesDelDia = Integer.parseInt(reparacionLunesString);

        //Salida de datos
        //Formula
        gananciasLunes = (float) (reparacionCosteRotatorio * 
                reparacionesDelDia);
        JOptionPane.showMessageDialog(null, "Hemos hecho "
                + reparacionesDelDia + " Cliente y hemos ganado  "
                + gananciasLunes + "€");

        //Martes
        //Creacion de panel de datos para introducir datos
        String costeMartesString = JOptionPane.showInputDialog(" Cuanto va a"
                + " valer la reparacion el Martes ");

        //Transformacion de un dato(double) a un string
        reparacionCosteRotatorio = Double.parseDouble(costeMartesString);

        //Panel que muestra cuanto vale la reparacione
        JOptionPane.showMessageDialog(null,"La reparacion vale hoy"
                + reparacionCosteRotatorio + "€");

        //Veces que se a reparado hoy
        String reparacionMartesString = JOptionPane.showInputDialog(" Cuantos "
                + "cliente hechos hemos hoy");

        //Transformacion de un dato(int) a un string
        reparacionesDelDia = Integer.parseInt(reparacionMartesString);

        //Salida de datos
        //Formula
        gananciasMartes = (float) (reparacionCosteRotatorio * 
                reparacionesDelDia);
        JOptionPane.showMessageDialog(null, "Hemos hecho "
                + reparacionesDelDia + " Cliente y hemos ganado  "
                + gananciasMartes + "€");

        //Miercoles 
        //Creacion de panel de datos para introducir datos
        String costeMiercolesString = JOptionPane.showInputDialog("Cuanto va a"
                + " valer la reparacion el Miercoles ");

        //Transformacion de un dato(double) a un string
        reparacionCosteRotatorio = Double.parseDouble(costeMiercolesString);

        //Panel que muestra cuanto vale la reparacione
        JOptionPane.showMessageDialog(null,"La reparacion vale hoy"
                + reparacionCosteRotatorio + "€");

        //Veces que se a reparado hoy 
        String reparacionMiercolesString = JOptionPane.showInputDialog("Cuantos"
                + " cliente hechos hemos hoy");

        //Transformacion de un dato(int) a un string
        reparacionesDelDia = Integer.parseInt(reparacionMiercolesString);

        //Salida de datos
        //Formula
        gananciasMiercoles = (float) (reparacionCosteRotatorio * 
                reparacionesDelDia);
        JOptionPane.showMessageDialog(null, "Hemos hecho "
                + reparacionesDelDia + " Cliente y hemos ganado  "
                + gananciasMiercoles + "€");

        //Jueves 
        //Creacion de panel de datos para introducir datos
        String costeJuevesString = JOptionPane.showInputDialog(" Cuanto va a "
                + "  valer la reparacion el Jueves ");

        //Transformacion de un dato(double) a un string
        reparacionCosteRotatorio = Double.parseDouble(costeJuevesString);

        //Panel que muestra cuanto vale la reparacione
        JOptionPane.showMessageDialog(null,"La reparacion vale hoy"
                + reparacionCosteRotatorio + "€");

        //Veces que se a reparado hoy 
        String reparacionJuevesString = JOptionPane.showInputDialog(" Cuantos"
                + " cliente hechos hemos hoy");

        //Transformacion de un dato(int) a un string
        reparacionesDelDia = Integer.parseInt(reparacionJuevesString);

        //Salida de datos
        //formula
        gananciasJueves = (float) (reparacionCosteRotatorio * 
                reparacionesDelDia);
        JOptionPane.showMessageDialog(null, "Hemos hecho "
                + reparacionesDelDia + " Cliente y hemos ganado  "
                + gananciasJueves + "€");

        //Viernes
        //Creacion de panel de datos para introducir datos
        String costeViernesString = JOptionPane.showInputDialog(" Cuanto va a "
                + " valer la reparacion el Vienes. ");

        //Transformacion de un dato(double) a un string
        reparacionCosteRotatorio = Double.parseDouble(costeViernesString);

        //Panel que muestra cuanto vale la reparaciones
        JOptionPane.showMessageDialog(null,"La reparacion vale hoy"
                + reparacionCosteRotatorio + "€");

        //Veces que se a reparado hoy 
        String reparacionViernesString = JOptionPane.showInputDialog(" Cuantos "
                + "cliente "
                + "hechos hemos hoy");

        //Transformacion de un dato(int) a un string
        reparacionesDelDia = Integer.parseInt(reparacionViernesString);

        //Salida de datos
        //Formula
        gananciasViernes = (float) (reparacionCosteRotatorio *
                reparacionesDelDia);
        JOptionPane.showMessageDialog(null, "Hemos hecho "
                + reparacionesDelDia + " Cliente y hemos ganado  "
                + gananciasViernes + "€");

        //Total de la semana
        //Formula calculo
        reparacionesTotalSemana
                = gananciasLunes
                + gananciasMartes
                + gananciasMiercoles
                + gananciasJueves
                + gananciasViernes;

        String resultadoSemana = """
                                En Pcroto,
                                Este Lunes hemos ganado:------%.1f€  
                                Este Martes hemos ganado:---- %.1f€
                                Este Miercoles hemos ganado:- %.1f€
                                Este Jueves hemos ganado:-----%.1f€
                                Este Viernes hemos ganado:----%.1f€
                                Esta semana hemos ganado:-----%.1f€
                                 
                                 
                               
                                
                                
                                """.formatted(gananciasLunes,
                                        gananciasMartes,
                                        gananciasMiercoles,
                                        gananciasJueves,
                                        gananciasViernes,
                                        reparacionesTotalSemana);

        JOptionPane.showMessageDialog(null, resultadoSemana);

        //Declaracion Variable para saber si se
        //superan los 1000 euros semanables como objetivo
        boolean objetivo = reparacionesTotalSemana > 1000;
        //Salida de datos en el panel
        JOptionPane.showMessageDialog(null, "¿Se ha "
                + "superando el objetivo de esta semana de 1000€? " + objetivo);

    }

}
