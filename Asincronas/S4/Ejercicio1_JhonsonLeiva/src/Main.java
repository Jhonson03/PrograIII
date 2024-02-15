import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /* Escribir un programa que permita al usuario ingresar una un año desde el teclado y éste
        evalúe si es un año bisiesto, un año es bisiesto si este es divisible entre 4 y no divisible
        entre 100, y también si es divisible entre 400. Por ejemplo, 1988, 1992 y 1996 son años
        bisiestos */

        String añoStr = JOptionPane.showInputDialog("Introduzca un año: ");
        int año = Integer.parseInt(añoStr);

        boolean bisiesto = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));

        String mensaje;
        if (bisiesto) {
            mensaje = "El año " + año + " es bisiesto.";
        } else {
            mensaje = "El año " + año + " no es bisiesto.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}